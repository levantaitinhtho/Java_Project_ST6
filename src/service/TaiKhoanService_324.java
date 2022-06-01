/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.StudentDao;
import dao.TaiKhoan_Dao_324;
import model.TaiKhoanDangNhap_324;

/**
 *
 * @author ACER
 */
public class TaiKhoanService_324 {
    TaiKhoan_Dao_324 taiKhoandao;
    public TaiKhoanService_324(){
        taiKhoandao = new TaiKhoan_Dao_324();
    }
    public TaiKhoanDangNhap_324 CheckAccount_324(String username, String password){
        return taiKhoandao.CheckAccount_324(username, password);
    }
}
