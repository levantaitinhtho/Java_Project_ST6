/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.StudentDao;
import model.Student;
import java.util.List;

/**
 *
 * @author Huynh Hau
 */
public class StudentService {
    private StudentDao studentDao;
    public StudentService(){
        studentDao = new StudentDao();
    }
    public List<Student> getAllStudents(){
        return studentDao.getAlLStudents();
    }
    public void DeleteTTPhong(String id){
        studentDao.DeleteTTPhong(id);
    }
    
}
