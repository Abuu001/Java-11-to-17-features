package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class TextBlockExample {

    @Test
    void textBlockExample(){
        String json1 = "{\n" +
                "\t\t\"name\": \"Doe\", \n" +
                "\t\t\"age\": \"21\", \n" +
               "}";

        System.out.println(json1);

        String json2 = """
                {
                 "name" : "John",
                 "age" :21
                }
                """;

        System.out.print(json2);
    }
}
