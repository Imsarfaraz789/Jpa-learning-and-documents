package com.jpatutorial.springdatajpa.repository;

import com.jpatutorial.springdatajpa.entity.Cource;
import com.jpatutorial.springdatajpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Cource courseDBa = Cource.builder()
                .title("DBA")
                .credit(5)
                .build();
        Cource courseJava = Cource.builder()
                .title("java")
                .credit(6)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Sarfaraz")
                .lastName("Chaudhary")
                .cources(List.of(courseDBa, courseJava))
                .build();

        teacherRepository.save(teacher);

    }


}