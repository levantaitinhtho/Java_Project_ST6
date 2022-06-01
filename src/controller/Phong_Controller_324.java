/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SinhVienTheoPhong_Dao_324;


public class Phong_Controller_324 {
    private String maPhong;
    private SinhVienTheoPhong_Dao_324 phong;

    public Phong_Controller_324() {
    }

    public Phong_Controller_324(String maPhong, SinhVienTheoPhong_Dao_324 phong) {
        this.maPhong = maPhong;
        this.phong = phong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public SinhVienTheoPhong_Dao_324 getPhong() {
        return phong;
    }

    public void setPhong(SinhVienTheoPhong_Dao_324 phong) {
        this.phong = phong;
    }
    public void displayPhong( String maPhong){
        phong.getRoomByMaPhong(maPhong);
    }
    
}
