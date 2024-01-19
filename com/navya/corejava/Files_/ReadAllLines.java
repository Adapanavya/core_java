package com.java.practice.Files_;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLines {
    public static void main(String[] args) throws IOException {
        Path pathFileRead= Paths.get("C:\\JavaSession\\Files\\resume.txt");
        //List<MyString> lines= Files.readAllLines(pathFileRead);
        //System.out.println(lines);

        Files.lines(pathFileRead)
                .map(String::toLowerCase)
                .filter(str->str.contains("h"))
                //.map(MyString::toUpperCase)
                .forEach(System.out::println);
    }

}
