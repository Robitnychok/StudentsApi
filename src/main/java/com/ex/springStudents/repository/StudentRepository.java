package com.ex.springStudents.repository;

import com.ex.springStudents.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student, Long>
{
    void deleteByEmail(String email);
    Student findByEmail(String email);
}
