package com.example.demo.api.controllers;

import com.example.demo.Service.StudentService;
import com.example.demo.api.controllers.models.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController

@RequestMapping("/api")
public class Controllers {
    StudentService ss = new StudentService();
    @GetMapping ("/all-students")
    public List<Students> getStudentsTest1(){
        List<Students> students = new ArrayList<>();
        students.add(new Students(1, "Ronaldo", "ronaldo@gmail.com", "0123456789"));
        students.add(new Students(2, "Messi", "messi@gmail.com", "0123987687"));
        students.add(new Students(3, "Neymar", "neymar@gmail.com", "010303097"));
        students.add(new Students(4, "Mbappe", "mbappe@gmail.com", "097654543"));
        students.add(new Students(5, "Lewandowski", "lewandowski@gmail.com", "0123456700"));
        return students;
    }
    @GetMapping("/students")
    public List<Students> getStudents(){
        return ss.getStudents();

    }
    @GetMapping("/student_param")
    public Students getStudentById(@RequestParam int id){
        return ss.getStudentById(id);
    }
}
