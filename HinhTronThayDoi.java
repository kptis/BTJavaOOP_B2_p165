package com.BTLopCIII;

public class HinhTronThayDoi extends HinhTron implements ThayDoiKichThuoc {

    public HinhTronThayDoi(double bankinh, double rate ){
          super(bankinh);
          this.banKinh = banKinh +banKinh*rate;
    }

    @Override
    public double changeSize(double rate) {
        return  this.banKinh +this.banKinh *rate;
    }
//    public double tinhS(){
//        return this.tinhS();
//    }
//    public double tinhP(){
//        return this.tinhP();
//    }

}
