package com.example.demo;



import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.records.Person;
import com.example.demo.records.PersonRecord;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class RecordsExample {

    @Test
    public void recordsExample(){
        Person person1 = new Person("John",33);
        assertEquals("John",person1.getName());

        PersonRecord person2 = new PersonRecord("Doe");
        assertEquals("Doe",person2.name());
    }
}
