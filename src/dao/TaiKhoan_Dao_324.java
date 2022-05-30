/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.KetNoiSQL;
import controller.KiemTraEmail_324;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.TaiKhoanDangNhap_324;

/**
 *
 * @author ACER
 */
public class TaiKhoan_Dao_324 {
   public TaiKhoanDangNhap_324 CheckAccount_324(String username, String password){
       Connection connect = KetNoiSQL.getConnection();
       String sql = "select * from Taikhoan where userName = ? and Pass = ?";
       try{
           PreparedStatement pr = connect.prepareStatement(sql);
           pr.setString(1,username);
           pr.setString(2,password);
           ResultSet rs = pr.executeQuery();
           while(rs.next()){
               TaiKhoanDangNhap_324 tk = new TaiKhoanDangNhap_324();
               tk.setUsername(rs.getString("userName"));
               tk.setPassword(rs.getString("Pass"));
               return tk;
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
       return null;
   }
     public static void main(String[] args) {
        TaiKhoan_Dao_324 kiemta = new TaiKhoan_Dao_324();
        kiemta.CheckAccount_324("levantaitinhtho", "123");
    }
}
