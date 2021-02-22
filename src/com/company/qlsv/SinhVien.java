package com.company.qlsv;

public class SinhVien extends Nguoi {
    private double toan;
    private double ly;
    private double hoa;
    private double dtb;

    public SinhVien(String hoTen, int tuoi, String diaChi, String cmnd, String gioiTinh, double toan, double ly, double hoa) {
        super(hoTen, tuoi, diaChi, cmnd, gioiTinh);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        dtb = (toan + ly + hoa) / 3;
    }

    public void doiGioiTinh(String gioiTinh1, String gioiTinh2) {
        super.gioiTinh = gioiTinh1;
        this.gioiTinh = gioiTinh2;
    }

    public void chaoHoi() {
        System.out.println("Em chào thầy!");
    }

    @Override
    public String toString() {
        return "Sinh vien: " + getHoTen() + ", " + getTuoi() + ", " + "điểm tb: " + dtb;
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien("A", 22, "TB", "123", "Nam", 3, 4, 5);
        sv.doiGioiTinh("Nu", "LGBT");
        sv.chaoHoi();
        System.out.println(sv);
    }
}
