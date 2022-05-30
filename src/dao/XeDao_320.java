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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Xe_320;

/**
 *
 * @author LÊ HOÀNG ANH TUẤN
 */
public class XeDao_320 {

    public List<Xe_320> getAllMotobike() {
        List<Xe_320> motos = new ArrayList<Xe_320>();
        KetNoiSQL connection = new KetNoiSQL();
        try {
            ResultSet rs = connection.GetResultSet("[Xe]");
            while (rs.next()) {
                Xe_320 moto = new Xe_320();

                moto.setMaXe(rs.getString("maXe"));
                moto.setMSV(rs.getString("maSV"));
                moto.setBienSo(rs.getString("bienSo"));
                moto.setNgayGui(rs.getString("ngayGui"));

                motos.add(moto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeDao_320.class.getName()).log(Level.SEVERE, null, ex);
        }
        return motos;

    }

    public void addMotobike(Xe_320 xe) {

        Connection connection = KetNoiSQL.getConnection();
        String sql = "INSERT INTO dbo.[Xe]( maXe,maSV,bienSo,ngayGui)"
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement pstm;
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, xe.getMaXe());
            pstm.setString(2, xe.getMSV());
            pstm.setString(3, xe.getBienSo());
            pstm.setString(4, xe.getNgayGui());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(XeDao_320.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteMotobike(String maXe) {
        try {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "DELETE FROM dbo.[Xe] WHERE maXe=?";
            PreparedStatement stm;
            stm = conn.prepareStatement(sql);
            stm.setString(1, maXe);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(XeDao_320.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Xe_320 getMotobikeById(int maXe) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "SELECT * FROM dbo.[Product] WHERE maXe= ? ";

        try {
            PreparedStatement stm;
            stm = conn.prepareStatement(sql);
            stm.setInt(1, maXe);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Xe_320 xe = new Xe_320();
                xe.setMaXe(rs.getString("maXe"));
                xe.setMSV(rs.getString("maSV"));
                xe.setBienSo(rs.getString("bienSo"));
                xe.setNgayGui(rs.getString("ngayGui"));

                return xe;
            }

        } catch (SQLException ex) {
            Logger.getLogger(XeDao_320.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}