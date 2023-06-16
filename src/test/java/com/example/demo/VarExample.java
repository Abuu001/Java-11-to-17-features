package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class VarExample {

    @Test
    public void varExample(){
        int a =2;
        String name = "Abraham";

        var name2 = "John Doe";

        assertEquals("John Doe",name2);
    }

}
