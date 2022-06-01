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
   
   
   public TaiKhoanDangNhap_324 getTaiKhoanByUser(String user) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from Taikhoan where userName = ?";

        try {
            PreparedStatement stm;
            stm = conn.prepareStatement(sql);
            stm.setString(1,"userName");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                TaiKhoanDangNhap_324 taiKhoanDangNhap_324 = new TaiKhoanDangNhap_324();
                taiKhoanDangNhap_324.setUsername(rs.getString("UserName"));
                taiKhoanDangNhap_324.setPassword(rs.getString("Pass"));
//                TaiKhoanDangNhap_324.setCScudien(rs.getFloat("CScudien"));
//                dienNuoc_317.setCSmoidien(rs.getFloat("CSmoidien"));
//                dienNuoc_317.setCScunuoc(rs.getFloat("CScunuoc"));
//                dienNuoc_317.setCSmoinuoc(rs.getFloat("CSmoinuoc"));
                return taiKhoanDangNhap_324;
            }

        } catch (Exception  e) {
            e.printStackTrace();
        }
        return null;
    }
}
