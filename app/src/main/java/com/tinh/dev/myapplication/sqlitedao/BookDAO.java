package com.tinh.dev.myapplication.sqlitedao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.tinh.dev.myapplication.Constant;
import com.tinh.dev.myapplication.database.DatabaseHelper;
import com.tinh.dev.myapplication.model.Book;
import com.tinh.dev.myapplication.model.User;

import java.util.ArrayList;
import java.util.List;

public class BookDAO implements Constant {
    private DatabaseHelper databaseHelper;
    public BookDAO(DatabaseHelper databaseHelper ) { this.databaseHelper = databaseHelper;}
    public void insertBook(Book book){

        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(B_COLUMN_NAME, book.getTenSach());
        contentValues.put(B_COLUMN_MASACH, book.getMaSach());
        contentValues.put(B_COLUMN_TACGIA, book.getTacGia());
        contentValues.put(B_COLUMN_NXB, book.getNXB());
        contentValues.put(B_COLUMN_GIA, book.getGia());
        contentValues.put(B_COLUMN_SOLUONG, book.getSoLuong());
        // tao cau lenh insert
        long id = sqLiteDatabase.insert(TABLE_BOOK, null, contentValues);

        Log.e("insertUser", "insertUser : " + id);

        sqLiteDatabase.close();
    }

    public Book getBookByBookname(String bookname) {

        Book book = null;

        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        Cursor cursor = sqLiteDatabase.query(TABLE_BOOK,
                new String[]{B_COLUMN_NAME, B_COLUMN_MASACH, B_COLUMN_TACGIA,B_COLUMN_NXB,
                B_COLUMN_GIA,B_COLUMN_SOLUONG},
                B_COLUMN_NAME + "=?",
                new String[]{bookname}, null, null, null);

        if (cursor != null && cursor.moveToFirst()) {

            String book_name = cursor.getString(cursor.getColumnIndex(B_COLUMN_NAME));
            String book_id = cursor.getString(cursor.getColumnIndex(B_COLUMN_MASACH));
            String book_tacgia = cursor.getString(cursor.getColumnIndex(B_COLUMN_TACGIA));
            String book_nxb = cursor.getString(cursor.getColumnIndex(B_COLUMN_NXB));

            String book_soluong = cursor.getString(cursor.getColumnIndex(B_COLUMN_SOLUONG));
            String book_gia  = cursor.getString(cursor.getColumnIndex(B_COLUMN_GIA));

          book = new Book();
            book.setTenSach(book_name);
            book.setMaSach(book_id);
            book.setTacGia(book_tacgia);
            book.setNXB(book_nxb);
            book.setSoLuong(book_soluong);
            book.setGia(book_gia);
            // them book vao List<Book>


        }

        return book ;
    }
    public List<Book> getAllBooks() {


        List<Book> bookList = new ArrayList<>();

        String SELECT_ALL_BOOK = "SELECT * FROM " + TABLE_BOOK;

        Log.e("getAllUsers", SELECT_ALL_BOOK);

        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        Cursor cursor = sqLiteDatabase.rawQuery(SELECT_ALL_BOOK, null);

        cursor.moveToFirst();

        do {

            String book_name = cursor.getString(cursor.getColumnIndex(B_COLUMN_NAME));
            String book_id = cursor.getString(cursor.getColumnIndex(B_COLUMN_MASACH));
            String book_tacgia = cursor.getString(cursor.getColumnIndex(B_COLUMN_TACGIA));
            String book_nxb = cursor.getString(cursor.getColumnIndex(B_COLUMN_NXB));
            String book_soluong = cursor.getString(cursor.getColumnIndex(B_COLUMN_SOLUONG));
            String book_gia = cursor.getString(cursor.getColumnIndex(B_COLUMN_GIA));

            Book book = new Book();

            book.setTenSach(book_name);
            book.setMaSach(book_id);
            book.setTacGia(book_tacgia);
            book.setNXB(book_nxb);
            book.setSoLuong(book_soluong);
            book.setGia(book_gia);


            // them user vao List< User >
            bookList.add(book);


        } while (cursor.moveToNext());

        cursor.close();
        sqLiteDatabase.close();

        return bookList;
    }


    public int deleteBook(String bookname) {
        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        return sqLiteDatabase.delete(TABLE_BOOK,
                 B_COLUMN_NAME+ "=?", new String[]{bookname});

    }

    public int updateBook(Book book) {
        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(B_COLUMN_NAME, book.getTenSach());
        contentValues.put(B_COLUMN_MASACH, book.getMaSach());
        contentValues.put(B_COLUMN_TACGIA, book.getTacGia());
        contentValues.put(B_COLUMN_NXB, book.getNXB());
        contentValues.put(B_COLUMN_GIA, book.getGia());
        contentValues.put(B_COLUMN_SOLUONG, book.getSoLuong());

        return sqLiteDatabase.update(TABLE_BOOK,
                contentValues,  B_COLUMN_NAME + "=?",
                new String[]{book.getTenSach()});

    }

}
