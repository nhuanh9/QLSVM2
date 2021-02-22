package com.company.qlsv;

public class QLSV {
    SinhVien[] dssv;

    public QLSV() {
        this.dssv = new SinhVien[0];
    }

    public void them(SinhVien sinhVien) {
        SinhVien[] dssv = new SinhVien[this.dssv.length + 1];
        System.arraycopy(this.dssv, 0, dssv, 0, this.dssv.length);
        dssv[this.dssv.length] = sinhVien;
        this.dssv = new SinhVien[dssv.length];
        System.arraycopy(dssv, 0, this.dssv, 0, dssv.length);
    }

    public void inDS() {
        for (int i = 0; i < this.dssv.length; i++) {
            System.out.println(this.dssv[i]);
        }
    }

    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        qlsv.them(new SinhVien("A", 22, "TB", "123", "Nam", 3, 4, 5));
        qlsv.them(new SinhVien("B", 22, "TB", "123", "Nam", 3, 4, 5));
        System.out.println("DS SV đang có: ");
        qlsv.inDS();
    }
}
