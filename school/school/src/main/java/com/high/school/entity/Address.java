package com.high.school.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String street;
    private String city;
    private String state;
    private String country;

    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name="student_id",
            referencedColumnName = "studentId"
    )
    private Student student;
}
