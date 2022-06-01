
package service;

import connect.KetNoiSQL;
import dao.StudentDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.SinhVien_tatCaThongTin_140;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentService {
    private StudentDao studentDao;
    public List<SinhVien_tatCaThongTin_140> getAlLStudents2;
   
    public StudentService(){
        studentDao = new StudentDao();
    }
    public List<SinhVien_tatCaThongTin_140> getAllStudents(){
        return studentDao.getAlLStudents();
    }
    public List<SinhVien_tatCaThongTin_140> getAllStudents2(){
        return studentDao.getAlLStudents2();
    }
   public void DeleteTTPhong(String id) throws SQLException {
        studentDao.DeleteTTPhong(id);
    }
    
        
    public SinhVien_tatCaThongTin_140 getStudentByMaSv_320 (String MaSV){
        return studentDao.getStudentByMaSv_320(MaSV);
    }
     public void addTTPhong(SinhVien_tatCaThongTin_140 stDao) throws SQLException{ 
        studentDao.addTTPhong(stDao );
}
}