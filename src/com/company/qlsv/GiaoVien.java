package com.company.qlsv;

public class GiaoVien extends Nguoi {
    private String monDay;


    public GiaoVien(String hoTen, int tuoi, String diaChi, String cmnd, String gioiTinh, String monDay) {
        super(hoTen, tuoi, diaChi, cmnd, gioiTinh);
        this.monDay = monDay;
    }

    public GiaoVien(String monDay) {
        this.monDay = monDay;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }
}
