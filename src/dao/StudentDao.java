package dao;

import connect.KetNoiSQL;
import model.SinhVien_tatCaThongTin_140;
import model.ThongTinPhong_140;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import service.StudentService;




public class StudentDao {

    public List<SinhVien_tatCaThongTin_140> getAlLStudents() {
        List<SinhVien_tatCaThongTin_140> students = new ArrayList<SinhVien_tatCaThongTin_140>();
        KetNoiSQL connection = new KetNoiSQL();
        try {
            ResultSet rs = connection.GetResultSet("[SinhVien]");
            while (rs.next()) {
                SinhVien_tatCaThongTin_140 student = new SinhVien_tatCaThongTin_140();

                student.setMaSv_140(rs.getString("MaSV"));
                student.setMaKTX_140(rs.getString("MaKTX"));
                student.setTen_140(rs.getString("HoTen"));
                student.setCMND_140(rs.getString("CMND"));
                student.setGioitinh_140(rs.getString("GioiTinh"));
                student.setNgaysinh_140(rs.getString("Ngaysinh"));
                student.setSDT_140(rs.getString("SDT"));
                student.setQuequan_140(rs.getString("Quequan"));
                student.setNgaylamhopdong_140(rs.getString("Ngaylamhopdong"));
                student.setHinh_140(rs.getString("Hinh"));
                student.setHotengh_140(rs.getString("Hotengh"));
                student.setSdtgh_140(rs.getString("Sdtgh"));
                student.setQuanhe_140(rs.getString("QuanHe"));
                student.setNghenghiep_140(rs.getString("Nghenghiep"));
                student.setMaPhong_140(rs.getString("maPhong"));
                
               
                students.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;

    }
   
    public SinhVien_tatCaThongTin_140 getStudentByID(String id) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "Select * from SinhVien where MaSV = ?";
        SinhVien_tatCaThongTin_140 student = new SinhVien_tatCaThongTin_140();
        try {
            PreparedStatement stm;
            stm = conn.prepareStatement(sql);
            stm.setString(1, id);
            ResultSet rs ;
            rs = stm.executeQuery();
            if (rs.next()) {
                student.setMaSv_140(rs.getString("MaSV"));
                student.setMaKTX_140(rs.getString("MaKTX"));
                student.setTen_140(rs.getString("HoTen"));
                student.setCMND_140(rs.getString("CMND"));
                student.setGioitinh_140(rs.getString("Gioitinh"));
                student.setNgaysinh_140(rs.getString("Ngaysinh"));
                student.setSDT_140(rs.getString("SDT"));
                student.setQuequan_140(rs.getString("Quequan"));
                student.setNgaylamhopdong_140(rs.getString("Ngaylamhopdong"));
                student.setMaPhong_140(rs.getString("MaPhong"));
                student.setHinh_140(rs.getString("Hinh"));
                student.setHotengh_140(rs.getString("Hotengh"));
                student.setSdtgh_140(rs.getString("Sdtgh"));
                student.setQuanhe_140(rs.getString("Quanhe"));
                student.setNghenghiep_140(rs.getString("Nghenghiep"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }
    public List<SinhVien_tatCaThongTin_140> getSinhVienTrongPhong(String id) {
        List<SinhVien_tatCaThongTin_140> st = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "Select * from SinhVien where maSV = ?";
        SinhVien_tatCaThongTin_140 student = new SinhVien_tatCaThongTin_140();
        try {
            PreparedStatement stm;
            stm = conn.prepareStatement(sql);
            stm.setString(1, id);
            ResultSet rs ;
            rs = stm.executeQuery();
            if (rs.next()) {
                student.setMaSv_140(rs.getString("MaSV"));
                student.setMaKTX_140(rs.getString("MaKTX"));
                student.setTen_140(rs.getString("HoTen"));
                student.setCMND_140(rs.getString("CMND"));
                student.setGioitinh_140(rs.getString("Gioitinh"));
                student.setNgaysinh_140(rs.getString("Ngaysinh"));
                student.setSDT_140(rs.getString("SDT"));
                student.setQuequan_140(rs.getString("Quequan"));
                student.setNgaylamhopdong_140(rs.getString("Ngaylamhopdong"));
                student.setMaPhong_140(rs.getString("maPhong"));
                student.setTenPhong_140(rs.getString("tenPhong"));
                student.setLoaiPhong_140(rs.getString("loaiPhong"));

                student.setHinh_140(rs.getString("Hinh"));
                student.setHotengh_140(rs.getString("Hotengh"));
                student.setSdtgh_140(rs.getString("Sdtgh"));
                student.setQuanhe_140(rs.getString("Quanhe"));
                student.setNghenghiep_140(rs.getString("Nghenghiep"));
                st.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return st;
    }
    
    public List<SinhVien_tatCaThongTin_140> getSinhVienTrongPhong_140(String id) {
        List<SinhVien_tatCaThongTin_140> st = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "Select * from Phong where maPhong = ?";
        SinhVien_tatCaThongTin_140 student = new SinhVien_tatCaThongTin_140();
        try {
            PreparedStatement stm;
            stm = conn.prepareStatement(sql);
            stm.setString(1, id);
            ResultSet rs ;
            rs = stm.executeQuery();
            if (rs.next()) {
                student.setTenPhong_140(rs.getString("tenPhong"));
                student.setMaPhong_140(rs.getString("maPhong"));
                student.setLoaiPhong_140(rs.getString("loaiPhong"));
                student.setSoSinhVienHienTai_140(rs.getString("soNguoiHienTai"));
                student.setSoSinhVienToiDa_140(rs.getString("soNguoiToiDa"));
                student.setTinhTrangPhong_140(rs.getString("tinhTrangPhong"));
                
                st.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return st;
    } 

     public List<SinhVien_tatCaThongTin_140> getSinhVien_tatCaThongTin_140(){
        List<SinhVien_tatCaThongTin_140> sv = new ArrayList<SinhVien_tatCaThongTin_140>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "Select * from Phong";
        
        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                SinhVien_tatCaThongTin_140 ttsv = new SinhVien_tatCaThongTin_140();
                ttsv.setTenPhong_140(rs.getString("tenPhong"));
                ttsv.setMaPhong_140(rs.getString("maPhong")); 
                ttsv.setLoaiPhong_140(rs.getString("loaiPhong"));
                ttsv.setSoSinhVienHienTai_140(rs.getString("soNguoiHienTai"));
                ttsv.setSoSinhVienToiDa_140(rs.getString("soNguoiToiDa"));
                ttsv.setTinhTrangPhong_140(rs.getString("tinhTrangPhong"));
                sv.add(ttsv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sv;
    }
     
    
    public void TimKiemTenPhong(SinhVien_tatCaThongTin_140 SD_140) {
        Connection conn = KetNoiSQL.getConnection();

        try {
            PreparedStatement stm = conn.prepareStatement("insert into maPhong values (?)");
            
            stm.setString(1, SD_140.getMaPhong_140());
            
            int resultSet = stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public SinhVien_tatCaThongTin_140 getStudentByMaSv_320(String MaSv) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "Select * from SinhVien where MaSV = ?";
        SinhVien_tatCaThongTin_140 student = new SinhVien_tatCaThongTin_140();
        try {
            PreparedStatement stm;
            stm = conn.prepareStatement(sql);
            stm.setString(1, MaSv);
            ResultSet rs ;
            rs = stm.executeQuery();
            if (rs.next()) {
                student.setMaSv_140(rs.getString("maSV"));
                student.setMaKTX_140(rs.getString("maKTX"));
                student.setTen_140(rs.getString("HoTen"));
                student.setCMND_140(rs.getString("CMND"));
                student.setGioitinh_140(rs.getString("gioiTinh"));
                student.setNgaysinh_140(rs.getString("ngaySinh"));
                student.setSDT_140(rs.getString("SDT"));
                student.setQuequan_140(rs.getString("queQuan"));
                student.setNgaylamhopdong_140(rs.getString("ngayLamHopDong"));
                student.setMaPhong_140(rs.getString("maPhong"));
                student.setHinh_140(rs.getString("Hinh"));
                student.setHotengh_140(rs.getString("hoTenGH"));
                student.setSdtgh_140(rs.getString("sdtGH"));
                student.setQuanhe_140(rs.getString("quanHe"));
                student.setNghenghiep_140(rs.getString("Nghenghiep"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
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
                svs.setGioitinh_140(rs.getString("gioiTinh"));
                svs.setSDT_140(rs.getString("SDT"));
                svs.setQuequan_140(rs.getString("queQuan"));
                sv.add(svs);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return sv;
    }
      
    public List<SinhVien_tatCaThongTin_140> GetResultSearch(String searchType, String valueSearch) {
        List<SinhVien_tatCaThongTin_140> student = new ArrayList<>();
        Connection conn = KetNoiSQL.getConnection();

       try {
            PreparedStatement ps = null;
            switch (searchType) {
                case "tenPhong":
                    ps = conn.prepareStatement("select * from Phong where tenPhong = ?");
                    ps.setObject(1, valueSearch);
                    break;

                case "maPhong":
                    ps = conn.prepareStatement("select * from Phong where maPhong = ?");
                    ps.setObject(2, valueSearch);
                    break;

                case "loaiPhong":
                    ps = conn.prepareStatement("select * from Phong where loaiPhong = ?");
                    ps.setObject(3, valueSearch);
                    break;

                case "soNguoiHienTai":
                    ps = conn.prepareStatement("select * from Phong where soNguoiHienTai = ?");
                    ps.setObject(4, valueSearch);
                    break;

                case "soNguoiToiDa":
                    ps = conn.prepareStatement("select * from Phong where soNguoiToiDa = ?");
                    ps.setObject(5, valueSearch);
                    break;
                    
                case "tinhTrangPhong":
                    ps = conn.prepareStatement("select * from Phong where tinhTrangPhong = ?");
                    ps.setObject(6, valueSearch);
                    break;
            }

            ResultSet result = ps.executeQuery();

            while (result.next()) {
                SinhVien_tatCaThongTin_140 sv40 = new SinhVien_tatCaThongTin_140();

                sv40.setTenPhong_140(result.getString("tenPhong"));
                sv40.setMaPhong_140(result.getString("maPhong"));
                sv40.setLoaiPhong_140(result.getString("loaiPhong"));
                sv40.setSoSinhVienHienTai_140(result.getString("soNguoiHienTai"));
                sv40.setSoSinhVienToiDa_140(result.getString("soNguoiToiDa"));
                sv40.setTinhTrangPhong_140(result.getString("tinhTrangPhong"));
                student.add(sv40);
            }
            return student;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}

        
  
