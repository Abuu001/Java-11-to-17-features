package com.example.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.records.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class NullPointerExceptionTest {

    @Test
    void testNullPointer() {
        Person person1 = new Person(null, 33);
        System.out.println(person1.getName().toLowerCase());
    }

}
