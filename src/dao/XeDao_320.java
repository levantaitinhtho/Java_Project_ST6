/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.KetNoiSQL;
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
}
