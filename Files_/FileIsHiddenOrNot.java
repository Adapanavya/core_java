package com.java.practice.File;

import java.io.File;
import java.util.Date;

public class FileIsHiddenOrNot {
    public static void main(String[] args){
        File f=new File("C:\\JavaSession\\Files\\resume.txt");
        //f.isHidden();
        //boolean b=f.isHidden();
        //System.out.println(b);
        //f.getName();
        //System.out.println(f.getName());
        f.canWrite();
        System.out.println(f.canWrite());
        f.setWritable(true);
        System.out.println(f.canWrite());
        System.out.println(new Date(f.lastModified()));

    }
}
