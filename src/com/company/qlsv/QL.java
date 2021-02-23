package com.company.qlsv;

public interface QL<T> {
    void them(T t);

    void inDS();

    void sua(T t);

    void xoa(String ma);

    T timKiem(String hoTen);
}
