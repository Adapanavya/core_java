package com.java.practice.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Directory1 {
    public static void main(String[] args)throws IOException {
        Path currentDirectory=Paths.get(".");
        Files. list(Paths.get(".")).forEach(System.out::println);
        Files.walk(currentDirectory,2).forEach(System.out::println);

    }
}
