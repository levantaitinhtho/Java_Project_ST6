/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien;


public class DaoSinhVien {
    public List<SinhVien> getAllUsers(){
    List<SinhVien> sinhVien = new ArrayList<SinhVien>();
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien";
        try{
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet rs = preparedStatement.executeQuery();
             while(rs.next()){
                   SinhVien sv  = new SinhVien();
                   sv.setMaPhong(rs.getString("maPhong"));
                   sv.setMsv(rs.getString("maSV"));
                   sv.setTen(rs.getString("Ten"));
                   sv.setCmnd(rs.getString("CMND"));
                   sv.setGioTinh(rs.getBoolean("gioiTinh"));
                   sv.setQueQuan(rs.getString("queQuan"));
                   sinhVien.add(sv);
             }
        }
        catch(SQLException e){
            e.printStackTrace();    
}
        return sinhVien;
}
    
    public List<SinhVien> getAllQueQuan(){
        List<SinhVien> sinhVien = new ArrayList<SinhVien>();
            Connection connection = KetNoiSQL.getConnection();
            String sql = "select queQuan from SinhVien";
            try{
                 PreparedStatement preparedStatement = connection.prepareStatement(sql);
                 ResultSet rs = preparedStatement.executeQuery();
                 while(rs.next()){
                       SinhVien sv  = new SinhVien();
                       sv.setQueQuan(rs.getString("queQuan"));
                       sinhVien.add(sv);
                 }
            }
            catch(SQLException e){
                e.printStackTrace();    
    }
            return sinhVien;
    }
    public List<SinhVien> getAllCMND(){
        List<SinhVien> sinhVien = new ArrayList<SinhVien>();
            Connection connection = KetNoiSQL.getConnection();
            String sql = "select CMND from SinhVien";
            try{
                 PreparedStatement preparedStatement = connection.prepareStatement(sql);
                 ResultSet rs = preparedStatement.executeQuery();
                 while(rs.next()){
                       SinhVien sv  = new SinhVien();
                       sv.setCmnd(rs.getString("CMND"));
                       sinhVien.add(sv);
                 }
            }
            catch(SQLException e){
                e.printStackTrace();    
    }
            return sinhVien;
}
    public List<SinhVien> getSinhVienName(String loai, String ten){
        
    List<SinhVien> sinhVien = new ArrayList<SinhVien>();
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where " +loai + " = ?";
        try{
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setString(1,ten);
             ResultSet rs = preparedStatement.executeQuery();
             while(rs.next()){
                   SinhVien sv  = new SinhVien();
                   sv.setMaPhong(rs.getString("maPhong"));
                   sv.setMsv(rs.getString("maSV"));
                   sv.setTen(rs.getString("Ten"));
                   sv.setCmnd(rs.getString("CMND"));
                   sv.setGioTinh(rs.getBoolean("gioiTinh"));
                   sv.setQueQuan(rs.getString("queQuan"));
                   sinhVien.add(sv);
             }
        }
        catch(SQLException e){
            e.printStackTrace();    
}
        return sinhVien;
}
    public List<SinhVien> getSinhVienQueQuan(String queQuan){
    List<SinhVien> sinhVien = new ArrayList<SinhVien>();
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where queQuan = ?";
        try{
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setString(1,queQuan);
             ResultSet rs = preparedStatement.executeQuery();
             while(rs.next()){
                   SinhVien sv  = new SinhVien();
                   sv.setMaPhong(rs.getString("maPhong"));
                   sv.setMsv(rs.getString("maSV"));
                   sv.setTen(rs.getString("Ten"));
                   sv.setCmnd(rs.getString("CMND"));
                   sv.setGioTinh(rs.getBoolean("gioiTinh"));
                   sv.setQueQuan(rs.getString("queQuan"));
                   sinhVien.add(sv);
             }
        }
        catch(SQLException e){
            e.printStackTrace();    
}
        return sinhVien;
}
}

