package com.ex.springStudents.service;

import com.ex.springStudents.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

     List<Student> findAllStudents();

     Student saveStudent(Student student);
     Student findEmail(String email);
     Student updateStudent(Student student);
     void deleteStudent(String email);

}
