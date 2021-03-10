package com.BTLopCIII;

public class HinhTron implements DoiTuongHInhHoc{
    public double banKinh;
    private static double PI = 3.14;
    public HinhTron (double r){
        banKinh= r;
    }
    @Override
    public double tinhP() {
        return 2* PI * banKinh;
    }

    @Override
    public double tinhS() {
        return PI*banKinh*banKinh;
    }
}
