package com.jpatutorial.springdatajpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "emialid_unique",
                columnNames = "email_address"
        )
) // this is used to change the table name / we can say the give table name and add contraints
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this is used to increament the value when new data is inset
    private Long studentId;
    private String firstName;
    private String lastName;

    @Column(name = "email_address",
    nullable = false)  //this is used to give the name emailId to email_address and email address not null
    private String emailId;

    @Embedded
    private Guardian guardian;

}
