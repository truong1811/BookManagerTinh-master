package com.tinh.dev.myapplication;

public interface Constant {
    /*Bang User*/
    // Ten Bang
     String TABLE_USER = "User";

    // Ten Cot
     String COLUMN_USERNAME = "userName";
     String COLUMN_PASSWORD = "Password";
     String COLUMN_PHONE = "Phone";
     String COLUMN_NAME = "hoTen";

    // Cau lenh tao bang
     String CREATE_TABLE_USER = "CREATE TABLE " + TABLE_USER + "(" +

            COLUMN_USERNAME + " NVARCHAR(50) PRIMARY KEY," +

            COLUMN_PASSWORD + " NVARCHAR(30)," +

            COLUMN_PHONE + " NVARCHAR," +

            COLUMN_NAME + " NVARCHAR" +

            ")";

    /*Bang Book*/
    String TABLE_BOOK = "Book";
    //ten cot
//    String B_COLUMN_ID = "MaSach";
    String B_COLUMN_NAME = "Bookname";
    String B_COLUMN_MASACH = "ma sach";
    String B_COLUMN_TACGIA = "TAC GIA";
    String B_COLUMN_NXB = "NXB";
    String B_COLUMN_GIA = "Description";
    String B_COLUMN_SOLUONG = "Position";

    String CREATE_TABLE_BOOK = "CREAT TABLE" + TABLE_BOOK + "(" +
            ""+ B_COLUMN_MASACH + " NVARCHAR(5) PRIMARY KEY NOT NULL," +
            ""+ B_COLUMN_TACGIA + " NVARCHAR(50)," +
            ""+ B_COLUMN_NAME + " NVARCHAR(50) NOT NULL," +
            "" + B_COLUMN_GIA + "FLOAT NOT NULL," +
            ""  + B_COLUMN_SOLUONG + " INT NOT NULL" +
            ")";


    /*Bang Book TypeBook*/

    // CREATE TABLE TypeBook (MaTheLoai CHAR(5) PRIMARY KEY NOT NULL,
    // typeName NVARCHAR(50) NOT NULL, Description NVARCHAR(255), Position INT)


    // Ten bang
    String TABLE_TYPE_BOOK = "typeBook";

    // Ten cot

    String TB_COLUMN_ID = "MaTheLoai";
    String TB_COLUMN_NAME = "typeName";
    String TB_COLUMN_DES = "Description";
    String TB_COLUMN_POS = "Position";


    String CREATE_TABLE_TYPE_BOOK = "CREATE TABLE " + TABLE_TYPE_BOOK + "(" +
            "" + TB_COLUMN_ID + " CHAR(5) PRIMARY KEY NOT NULL," +
            "" + TB_COLUMN_NAME + " NVARCHAR(50) NOT NULL," +
            "" + TB_COLUMN_DES + " NVARCHAR(255)," +
            "" + TB_COLUMN_POS + " INT" +
            ")";









}
