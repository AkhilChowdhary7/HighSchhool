package com.high.school;

import com.high.school.entity.Results;
import com.high.school.entity.Score;
import com.high.school.entity.Student;
import com.high.school.entity.Subject;
import com.high.school.repository.ResultsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class ResultsRepositoryTest {

    @Autowired
    private ResultsRepository resultsRepository;

    @Test
    public void saveResults() throws ParseException {
        Student student = new Student();

//        student.setStudentId(1);
        student.setFirstName("Venkat");
        student.setLastName("G");
        student.setEmail("ven@gmail.com");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdate = dateFormat.parse("2000-08-06");
        student.setBirthDate(birthdate);
        student.setYear(Year.of(2023));

        Score score = new Score();
        score.setScore(10);

        Subject subject = new Subject();
        subject.setSubject("Math");

        Results results = new Results();

        results.setScore(score);
        results.setSubject(subject);
        results.setStudent(student);

        resultsRepository.save(results);
    }

    @Test
    public void printAllResults(){
        List<Results> resultsList =
                resultsRepository.findAll();

        System.out.println("results list = " + resultsList);

    }
}
