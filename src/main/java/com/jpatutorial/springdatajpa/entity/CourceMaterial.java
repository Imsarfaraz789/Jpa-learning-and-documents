package com.jpatutorial.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "cource")
public class CourceMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseMaterialId;
    private String url;

    @OneToOne( // realtion and cascading
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(   //foreign key
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Cource cource;
}
