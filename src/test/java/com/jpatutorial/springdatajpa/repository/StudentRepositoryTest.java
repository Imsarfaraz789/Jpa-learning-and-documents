package com.jpatutorial.springdatajpa.repository;

import com.jpatutorial.springdatajpa.entity.Guardian;
import com.jpatutorial.springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Struct;
import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("imsarfaraz@gmail.com")
                .firstName("sarfaraz")
                .lastName("chaudhary")
                //.guardianName("Haider")
                //.guardianEmail("haider@gmail.com")
                //.guardianMobile("9594027045")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuadian(){
        Guardian guardian = Guardian.builder()
                .name("haider")
                .email("haider@gmail.com")
                .mobile("9594027045")
                .build();

        Student student = Student.builder()
                .emailId("sarfaraz@gmail.com")
                .firstName("sarfaraz")
                .lastName("chaudhary")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }


    @Test
    public void printStudentByFirstName(){
        List<Student> studentList = studentRepository.findByFirstName("sarfaraz");
        System.out.println("studentList = " + studentList);
    }

    @Test
    public void findByFirstNameContaining(){
        List<Student> studentList = studentRepository.findByFirstNameContaining("sarfa");
        System.out.println("studentList = " + studentList);
    }

    @Test
    public void printStudentByEmailAddress(){
        Student student = studentRepository.getStudentByEmailAddress("imsarfaraz@gmail.com");
        System.out.println("student = " + student);
    }

    //native query
    @Test
    public void printgetStudentByEmailAddressNative(){
        Student student = studentRepository.getStudentByEmailAddressNative("imsarfaraz@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public void printgetStudentByEmailAddressNamedParam(){

        Student student = studentRepository.getStudentByEmailAddressNamedParam("imsarfaraz@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public  void setupdateStudentNamedByemailId(){
        studentRepository.updateStudentNamedByemailId(
                "Sameer",
                "imsarfaraz@gmail.com"
        );
    }
}