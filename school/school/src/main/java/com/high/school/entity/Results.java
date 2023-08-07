package com.high.school.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Results {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resultId;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "subject_id",
            referencedColumnName = "subjectId"
    )
    private Subject subject;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn (
            name = "score_id",
            referencedColumnName = "scoreId"
    )
    private Score score ;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name="student_id",
            referencedColumnName = "studentId"
    )
    private Student student;




}
