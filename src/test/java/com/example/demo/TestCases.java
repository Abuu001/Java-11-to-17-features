package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class TestCases {


    @ParameterizedTest()
    @ValueSource(strings = "BMW")
    void switchCaseTest(String brand){

        switch (brand){
            case "BMW","BMW2","BMW3" -> System.out.println("BMW");
            case "TOYOTA","TOYOTA1" -> System.out.println("TOYOTA");
            case "VOLVO" -> System.out.println("TOYOTA");
            default -> System.out.println("AUDI");
        }
    }
}
