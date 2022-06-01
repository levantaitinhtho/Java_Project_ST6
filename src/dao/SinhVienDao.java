
package dao;

import connect.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien_trangChu_324;


public class SinhVienDao {
    
    //Ham duoc su dung de lay tat ca thong tin cua sinh vien
    public List<SinhVien_trangChu_324> getTatCaThongTinSinhVien_324(){
    List<SinhVien_trangChu_324> sinhVien = new ArrayList<SinhVien_trangChu_324>();
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                SinhVien_trangChu_324 sv  = new SinhVien_trangChu_324();
                sv.setMaPhong_324(rs.getString("maPhong"));
                sv.setMsv_324(rs.getString("maSV"));
                sv.setTen_324(rs.getString("HoTen"));
                sv.setCmnd_324(rs.getString("CMND"));
                sv.setGioTinh_324(rs.getBoolean("gioiTinh"));
                sv.setQueQuan_324(rs.getString("queQuan"));
                sinhVien.add(sv);
             }
        }
        catch(SQLException e){
            e.printStackTrace();    
        }
        return sinhVien;
    }
    
    //Ham nay lay tat ca thong tin cua sinh vien theo " Que Quan "
    public List<SinhVien_trangChu_324> getThongTinTheoQueQuan_324(){
        List<SinhVien_trangChu_324> sinhVien = new ArrayList<SinhVien_trangChu_324>();
            Connection connection = KetNoiSQL.getConnection();
            String sql = "select DISTINCT queQuan from SinhVien";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while(rs.next()){
                       SinhVien_trangChu_324 sv  = new SinhVien_trangChu_324();
                       sv.setQueQuan_324(rs.getString("queQuan"));
                       sinhVien.add(sv);
                }
            }
            catch(SQLException e){
                e.printStackTrace();    
            }
        return sinhVien;
    }
    
    //Ham nay duoc su dung de lay ra tat ca " so CMND " cua sinh vien
    public List<SinhVien_trangChu_324> getThongTinTheoCMND_324(){
        List<SinhVien_trangChu_324> sinhVien = new ArrayList<SinhVien_trangChu_324>();
            Connection connection = KetNoiSQL.getConnection();
            String sql = "select CMND from SinhVien";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while(rs.next()){
                       SinhVien_trangChu_324 sv  = new SinhVien_trangChu_324();
                       sv.setCmnd_324(rs.getString("CMND"));
                       sinhVien.add(sv);
                 }
            }
            catch(SQLException e){
                e.printStackTrace();    
            }
        return sinhVien;
    }
    
    //Su dung chung de kiem tra thong tin tim kiem
    public SinhVien_trangChu_324 getTen(String theLoai ,String doiTuong){
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where " + theLoai + " = ?";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,doiTuong);
                ResultSet rs = preparedStatement.executeQuery();
                   while(rs.next()){
                    SinhVien_trangChu_324 sv  = new SinhVien_trangChu_324();
                        sv.setMaPhong_324(rs.getString(theLoai));
                        System.out.println(sv.getMaPhong_324());
                        return sv;
                   }
            }
            catch(SQLException e){
                e.printStackTrace();    
            }
       return null;
    }
    
    //Hay nay duoc su dung de lay thong tin theo dieu kien "where"
    public List<SinhVien_trangChu_324> getThongTinTheoDieuKien_324(String loai, String ten){   
        List<SinhVien_trangChu_324> sinhVien = new ArrayList<SinhVien_trangChu_324>();
            Connection connection = KetNoiSQL.getConnection();
            String sql = "select * from SinhVien where " +loai + " = ?";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,ten);
                ResultSet rs = preparedStatement.executeQuery();
                while(rs.next()){
                    SinhVien_trangChu_324 sv  = new SinhVien_trangChu_324();
                    sv.setMaPhong_324(rs.getString("maPhong"));
                    sv.setMsv_324(rs.getString("maSV"));
                    sv.setTen_324(rs.getString("HoTen"));
                    sv.setCmnd_324(rs.getString("CMND"));
                    sv.setGioTinh_324(rs.getBoolean("gioiTinh"));
                    sv.setQueQuan_324(rs.getString("queQuan"));
                    sinhVien.add(sv);
                 }
            }
            catch(SQLException e){
                e.printStackTrace();    
            }
        return sinhVien;
}

}


