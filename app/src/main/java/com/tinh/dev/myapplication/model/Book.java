package com.tinh.dev.myapplication.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String MaSach;
    private String TenSach;
    private String SoLuong;
    private String TacGia;
    private String NXB;
    private String Gia;

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }
    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String maSach) {
        MaSach = maSach;
    }public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }public String getNXB() {
        return NXB;
    }

    public void setNXB(String nxb) {
        NXB = nxb;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String soLuong) {
        SoLuong = soLuong;
    }

//    public int getAnh() {
//        return Anh;
//    }
//
//    public void setAnh(int anh) {
//        Anh = anh;
//    }

    public Book(String tenSach, String soLuong, String maSach,String tacGia , String nxb, String gia) {

        TenSach = tenSach;
        SoLuong = soLuong;
        MaSach = maSach;
        TacGia = tacGia;
        Gia = gia;
        NXB = nxb;
    }
    public Book() {

    }

}
