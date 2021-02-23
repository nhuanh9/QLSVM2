package com.company.qlsv;

public class QLGV implements QL<GiaoVien>{
    private GiaoVien[] giaoViens;

    public QLGV(GiaoVien[] giaoViens) {
        this.giaoViens = giaoViens;
    }

    @Override
    public void them(GiaoVien giaoVien) {

    }

    @Override
    public void inDS() {

    }

    @Override
    public void sua(GiaoVien giaoVien) {

    }

    @Override
    public void xoa(String ma) {

    }

    @Override
    public GiaoVien timKiem(String hoTen) {
        return null;
    }
}
