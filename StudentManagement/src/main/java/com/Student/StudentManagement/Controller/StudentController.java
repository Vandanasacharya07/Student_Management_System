package com.Student.StudentManagement.Controller;


import com.Student.StudentManagement.Entity.Student;
import com.Student.StudentManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // Add a new student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // Update a student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    // Delete a student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}


//package com.Student.StudentManagement.Controller;
//
//import com.Student.StudentManagement.Entity.Student;
//import com.Student.StudentManagement.Service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/students")
//@CrossOrigin(origins = "http://localhost:3000")  // Allow CORS for this controller
//public class StudentController {
//
//    @Autowired
//    private StudentService studentService;
//
//    // Get all students
//    @GetMapping
//    public List<Student> getAllStudents() {
//        return studentService.getAllStudents();
//    }
//
//    // Get student by ID
//    @GetMapping("/{id}")
//    public Optional<Student> getStudentById(@PathVariable Long id) {
//        return studentService.getStudentById(id);
//    }
//
//    // Add a new student
//    @PostMapping
//    public Student addStudent(@RequestBody Student student) {
//        return studentService.addStudent(student);
//    }
//
//    // Update a student
//    @PutMapping("/{id}")
//    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
//        return studentService.updateStudent(id, student);
//    }
//
//    // Delete a student
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable Long id) {
//        studentService.deleteStudent(id);
//    }
//}

