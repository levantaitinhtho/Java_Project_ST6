/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien_tatCaThongTin_140;
import model.Thongke_NS_317;

/**
 *
 * @author Admin
 */
public class ThongKeDao implements ThongKeDao_317 {
    @Override
    public List<Thongke_NS_317> getListBySinhVien() {
         Connection cons = KetNoiSQL.getConnection();
        String sql = "select  YEAR(ngaySinh) as Năm_Sinh , COUNT(*) as SinhVienSinhNam from SinhVien group by YEAR(ngaySinh);";
        List<Thongke_NS_317> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Thongke_NS_317 thongke_NS_317 = new Thongke_NS_317();
                thongke_NS_317.setNamSinh(rs.getString("Năm_Sinh"));
                thongke_NS_317.setSoLuongSV(rs.getInt("SinhVienSinhNam"));
                list.add(thongke_NS_317);
            }
            ps.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
