package com.java.practice.File;
import java.io.File;

public class ListOfFiles {
    public static void main(String[] args){
        //int count=0;
        File directoryPath=new File("C:\\JavaSession");
        String[] contents=directoryPath.list();
        for (String directories:contents) {
            System.out.println(directories);
            //count++;
        }
        //System.out.println("List of files and directories inside C:\\JavaSession:"+count);
        }
    }
