package com.BTLopCIII;

public class KiemTra {

    public static void main(String[] args) {
	// write your code here
        HinhTron c1= new HinhTron(3);
        HinhTronThayDoi c11 = new HinhTronThayDoi(3, 0.5);
        System.out.println("Chu vi hinh tron ban dau: "+c1.tinhP());
        System.out.println("Dien tich hinh tron ban dau: "+c1.tinhS());
        System.out.println("Chu vi hinh tron thay doi: "+c11.tinhP());
        System.out.println("Dien tich hinh tron thay doi: "+c11.tinhS());
    }
}
