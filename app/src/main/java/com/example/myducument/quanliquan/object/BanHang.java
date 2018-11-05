package com.example.myducument.quanliquan.object;

public class BanHang {
    String tenMatHang;
    int soLuongMatHang;
    int soNguoi;
    int soBan;
    int soTien;

    public BanHang(String tenMatHang, int soLuongMatHang, int soNguoi, int soBan, int soTien) {
        this.tenMatHang = tenMatHang;
        this.soLuongMatHang = soLuongMatHang;
        this.soNguoi = soNguoi;
        this.soBan = soBan;
        this.soTien = soTien;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public int getSoLuongMatHang() {
        return soLuongMatHang;
    }

    public void setSoLuongMatHang(int soLuongMatHang) {
        this.soLuongMatHang = soLuongMatHang;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }
}
