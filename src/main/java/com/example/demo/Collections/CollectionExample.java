package com.example.demo.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExample {

    public void collectionExample(){
        //older way
        Set<String> nameSet = new HashSet<>();
        nameSet.add("John");
        nameSet.add("Doe");

        Map<String,String> countriesMap = new HashMap<>();
        countriesMap.put("Poland","Warsaw");
        countriesMap.put("Germany", "Berlin");

        List<String> nameList = new ArrayList<>();
        nameList.add("Peter");
        nameList.add("Pan");

        //new way
        List<String> names = List.of("John");
        Set<String> setName = Set.of("Doe");
        Map<String,String> countries = Map.of("Poland","Warsaw","Germany", "Berlin");
        Map<String,String> countries2 = Map.ofEntries(Map.entry("Poland","Warsaw"),Map.entry("Germany", "Berlin"));
    }
}
