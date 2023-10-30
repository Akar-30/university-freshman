package Freshman;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class School2 {
    public static void notMain(String [] args){
        ArrayList<Integer>newList=new ArrayList<Integer>();
        ArrayList<Character>newList2=new ArrayList<Character>();
        ArrayList<Boolean>newList3=new ArrayList<Boolean>();
        newList3.add(true);

        newList2.add('\\');
        newList2.add('s');
        newList2.add('\n');
        newList2.add('/');
        Collections.sort(newList2);
        for(char c : newList2) System.out.println(c);
        newList.add(3);
        int [] arr={1,2,3,6,4,3,2,1,8,0};
        Arrays.sort(arr);
        String [] arrS={"akar","AKAR","hama","aang"};
        for (int i:arr) System.out.println(i);
        Arrays.sort(arrS);
        for (String s :arrS) System.out.println(s);
    }

    public static void main(String[] args) {
        try{
            System.out.println(1);
            int x = 100/0;
            System.out.println(2);
        }
        catch (Exception e){
            System.out.println(3);
        }


    }
}
