
package service;

import dao.StudentDao;
import model.SinhVien_tatCaThongTin_140;
import java.util.List;

public class StudentService {
    private StudentDao studentDao;
    public StudentService(){
        studentDao = new StudentDao();
    }
    public List<SinhVien_tatCaThongTin_140> getAllStudents(){
        return studentDao.getAlLStudents();
    }
    public void DeleteTTPhong(String id){
        studentDao.DeleteTTPhong(id);
    }
    public SinhVien_tatCaThongTin_140 getStudentByMaSv_320 (String MaSV){
        return studentDao.getStudentByMaSv_320(MaSV);
    }
    
}
