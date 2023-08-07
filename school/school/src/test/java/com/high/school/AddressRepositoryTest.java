package com.high.school;

import com.high.school.entity.Address;
import com.high.school.entity.Student;
import com.high.school.repository.AddressRepository;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

@SpringBootTest
public class AddressRepositoryTest {

    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void saveAddress() throws ParseException {
        Student student = new Student();

//        student.setStudentId(1);
        student.setFirstName("Ruchith");
        student.setLastName("R");
        student.setEmail("ruc@gmail.com");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdate = dateFormat.parse("2000-08-01");
        student.setBirthDate(birthdate);
        student.setYear(Year.of(2023));

        Address address = new Address();

        address.setStreet("2029");
        address.setCity("wichita");
        address.setState("KS");
        address.setCountry("US");
        address.setStudent(student);


        addressRepository.save(address);

    }
}
