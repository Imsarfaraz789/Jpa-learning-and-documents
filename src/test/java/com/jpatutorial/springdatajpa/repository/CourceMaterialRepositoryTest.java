package com.jpatutorial.springdatajpa.repository;

import com.jpatutorial.springdatajpa.entity.Cource;
import com.jpatutorial.springdatajpa.entity.CourceMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourceMaterialRepositoryTest {
    @Autowired
    private CourceMaterialRepository courceMaterialRepository;

    @Test
    public void saveCourseMaterial(){

        Cource cource = Cource.builder()
                .title("DSA")
                .credit(6)
                .build();

        CourceMaterial courceMaterial = CourceMaterial.builder()
                .url("www.google.com")
                .cource(cource)
                .build();

        courceMaterialRepository.save(courceMaterial);
    }


    @Test
    public  void printCourceMaterial(){
        List<CourceMaterial> courceMaterials = courceMaterialRepository.findAll();
        System.out.println("courceMaterials = " + courceMaterials);
    }
}