package com.java.practice.File;

import java.io.File;
import java.io.IOException;

public class FileCreationAndDelete {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\JavaSession\\Files\\resume.txt");
        if (f.exists())
            f.delete();
        f.createNewFile();
        //f.exists();
        //f.createNewFile();
        boolean s=f.createNewFile();
        System.out.println(s);

    }
}
