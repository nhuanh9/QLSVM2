package com.company.qlsv;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String cmnd;
    protected String gioiTinh;

    public Nguoi(String hoTen, int tuoi, String diaChi, String cmnd, String gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.cmnd = cmnd;
        this.gioiTinh = gioiTinh;
    }



    public Nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void chaoHoi() {
        System.out.println("Tôi chào bạn!");
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }
}
