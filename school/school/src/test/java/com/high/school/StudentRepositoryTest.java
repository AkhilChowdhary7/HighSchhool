package com.high.school;

import com.high.school.entity.Student;
import com.high.school.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Year;
import java.util.List;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() throws ParseException {
        Student student = new Student();

//        student.setStudentID(1);
        student.setFirstName("Akhil");
        student.setLastName("G");
        student.setEmail("akhil@gmail.com");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdate = dateFormat.parse("2001-02-24");
        student.setBirthDate(birthdate);
        student.setYear(Year.of(2023));

        studentRepository.save(student);
    }

    @Test
    public void printAllStudents(){
        List<Student> studentList =
                (List<Student>) studentRepository.findAll();

        System.out.println("student list = " + studentList);

    }

    @Test
    public void printStudentByFirstName(){

        List<Student> students = studentRepository.findByFirstName("Akhil");

        System.out.println("students = " + students);
    }
}
