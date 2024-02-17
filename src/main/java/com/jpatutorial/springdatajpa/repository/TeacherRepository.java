package com.jpatutorial.springdatajpa.repository;

import com.jpatutorial.springdatajpa.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
