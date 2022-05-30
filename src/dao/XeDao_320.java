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
        List<Xe_320> Motos = new ArrayList<Xe_320>();
        KetNoiSQL connection = new KetNoiSQL();
        try {
            ResultSet rs = connection.GetResultSet("[Xe]");
            while (rs.next()) {
                Xe_320 Moto = new Xe_320();
                Moto.setMaXe(rs.getString("maXe"));
                Moto.setMSV(rs.getString("maSV"));
                Moto.setBienSo(rs.getString("bienSo"));
                Moto.setNgayGui(rs.getString("ngayGui"));

                Motos.add(Moto);
            }
            System.out.println("Thanh Cong");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Motos;

    }
    public static void main(String[] args) {
        XeDao_320 xe = new XeDao_320();
        List<Xe_320> list = xe.getAllMotobike();
        for(Xe_320 moto: list){
            System.out.println(moto.getMaXe());
        }
    }
    
}
