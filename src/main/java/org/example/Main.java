package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> first = new ArrayList<>(List.of("odin", "dva", "dva", "tri"));

        List <String> second = first.stream()
                .distinct().collect(Collectors.toList());

        for (String i :
                second) {
            System.out.println(i);
        }
    }
}