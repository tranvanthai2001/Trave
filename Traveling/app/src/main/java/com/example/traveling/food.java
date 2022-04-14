package com.example.traveling;

public class food {
    public String Ten;
    public String Mota;
    public Integer Hinh;

    public food(String ten, String mota, Integer hinh) {
        Ten = ten;
        Mota = mota;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public Integer getHinh() {
        return Hinh;
    }

    public void setHinh(Integer hinh) {
        Hinh = hinh;
    }
}
