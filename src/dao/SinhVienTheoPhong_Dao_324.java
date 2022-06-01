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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien_tatCaThongTin_140;
import model.SinhVien_trangChu_324;
import model.ThongTinPhong_140;

public class SinhVienTheoPhong_Dao_324 {
    public ThongTinPhong_140 getRoomByMaPhong(String maPhong){
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select * from Phong where maPhong = ?";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,maPhong);
                ResultSet rs = preparedStatement.executeQuery();
                while(rs.next()){
                    ThongTinPhong_140 sv  = new ThongTinPhong_140();
                    sv.setTenPhong(rs.getString("tenPhong"));
                    sv.setMaPhong(rs.getString("maPhong"));
                    sv.setLoaiPhong(rs.getString("loaiPhong"));
                    sv.setSoSVHienTai(rs.getString("soNguoiHienTai"));
                    sv.setSoSVToiDa(rs.getString("soNguoiToiDa"));
                    sv.setTinhTrangPhong(rs.getString("tinhTrangPhong"));
                    return sv;
                 }
            }
            catch(SQLException e){
                e.printStackTrace();    
            }
        return null;
    }
    public List<SinhVien_tatCaThongTin_140> getAllStudenByRoom(String maPhong){
        List<SinhVien_tatCaThongTin_140> sv = new ArrayList<>();
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where maPhong = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maPhong);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                SinhVien_tatCaThongTin_140 svs = new SinhVien_tatCaThongTin_140();
                svs.setMaSv_140(rs.getString("maSV"));
                svs.setTen_140(rs.getString("HoTen"));
                svs.setCMND_140(rs.getString("CMND"));
                svs.setNgaysinh_140(rs.getString("ngaySinh"));
                svs.setGioitinh_140(rs.getInt("gioiTinh"));
                svs.setSDT_140(rs.getString("SDT"));
                svs.setQuequan_140(rs.getString("queQuan"));
                sv.add(svs);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return sv;
    }
    public int demSV(String maPhong){
        Connection connection = KetNoiSQL.getConnection();
        int a = 0;
        String sql = "select * from SinhVien where maPhong = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maPhong);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                a = a+1;
            }
            System.out.println(a);
            }catch(Exception ex){
            ex.printStackTrace();
        }
        return a;
    }

}
