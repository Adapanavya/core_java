package com.java.practice.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesForList {
    public static void main(String[] args)throws IOException {
        Path fileToRead= Paths.get("C:\\JavaSession\\Files\\file.txt");
        List<String>list=List.of("abs","navya","adapa","heloo");
        Files.write(fileToRead,list);
    }
}
