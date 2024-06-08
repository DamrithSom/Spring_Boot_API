package com.example.demo.Service;

import com.example.demo.api.controllers.models.Students;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService
{
    ArrayList<Students>  students = new ArrayList<>();
    public StudentService()
    {
        students.add(new  Students(1, "Alex", "alex@gmail.com", "0123456789"));
        students.add(new  Students(2, "John", "john@gmail.com", "0123987687"));
        students.add(new  Students(3, "Dele", "dele@gmail.com", "0123967887"));
        students.add(new  Students(4, "Kane", "kane@gmail.com", "0123987687"));
        students.add(new  Students(5, "Son", "son@gmail.com", "0123987687"));
    }
    public ArrayList<Students> getStudents()
    {
        return students;
    }
    public Students getStudentById(int Id) {
        for (Students temp : students) {
            if (temp.getId() == Id) {
                return temp;
            }
        }
        return null;
    }
}
