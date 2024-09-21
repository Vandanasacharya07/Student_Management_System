package com.Student.StudentManagement.Repository;

import com.Student.StudentManagement.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

