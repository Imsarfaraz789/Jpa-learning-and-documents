package com.jpatutorial.springdatajpa.repository;

import com.jpatutorial.springdatajpa.entity.Cource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourceRepositoryTest {

    @Autowired
    CourceRepository courceRepository;

    @Test
    public void printCourceDetails(){
        List<Cource> cources =  courceRepository.findAll();
        System.out.println("cources = " + cources);
    }

}