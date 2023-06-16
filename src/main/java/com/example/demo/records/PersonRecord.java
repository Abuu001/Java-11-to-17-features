package com.example.demo.records;

public record PersonRecord(String name, int age) {
      public PersonRecord(String name2){
        this(name2,0);
    }
}
