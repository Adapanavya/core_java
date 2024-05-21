package com.java.practice.arrayList;

import com.java.practice.practicePrograms.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeArrayLists {
    public static ArrayList<Integer> mergeTwoArraylist(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> mergeList=new ArrayList<>();
        mergeList.addAll(list1);
        mergeList.addAll(list2);
        Collections.sort(mergeList);
        return mergeList;
    }
    public static void main(String[] args){
        ArrayList<Integer> arrayList1=new ArrayList<>(Arrays.asList(1,4,2,3));
        ArrayList<Integer> arrayList2=new ArrayList<>(Arrays.asList(6,8,7,5));
        ArrayList<Integer> merge=mergeTwoArraylist(arrayList1,arrayList2);
        System.out.println(merge);
        System.out.println(merge.contains(10));
    }
}
