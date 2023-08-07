package com.high.school.entity;

import java.util.Date;
import java.time.Year;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(
        name = "student",
        uniqueConstraints = @UniqueConstraint(
              name = "studentId_unique",
              columnNames = "studentId"

        )
)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 100)
    private String email;

//    @Column(nullable = false, length = 100)
    private Date birthDate;

    @Column(nullable = false, length = 100)
    private Year year;

    @OneToOne(
            mappedBy = "student"
    )
    private Address address;


}
