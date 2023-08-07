package com.high.school.repository;

import com.high.school.entity.Student;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    public List<Student> findByFirstName(String firstName);

}
