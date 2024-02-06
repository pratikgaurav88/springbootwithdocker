package com.oracle.studentservice.controller;

import com.oracle.studentservice.dto.Student;
import com.oracle.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/gettime")
    public String getTime(){
        return "Hello User, the current time is :: " + new Date();
    }
    @PostMapping("/addstudent")
    public Student saveStudent(@RequestBody Student student){
        System.out.println("Student :: " + student.getFirstName());
        return studentRepository.save(student);
    }
    @GetMapping("/getstudents")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    @GetMapping("/getstudent/{studentId}")
    public Optional<Student> getStudentById(@PathVariable UUID studentId){
        return studentRepository.findById(studentId);
    }
    @DeleteMapping("/deletestudent/{studentId}")
    public void deleteStudentById(@PathVariable UUID studentId){
        studentRepository.deleteById(studentId);
    }
    @PutMapping("/updateStudent/{studentId}")
    public Student updateStudent(@PathVariable UUID studentId,@RequestBody Student student){
        if(studentRepository.findById(studentId).isPresent()){
            student.setStudentId(studentId);
            return studentRepository.save(student);
        }
        else{
            return null;
        }
    }
}
