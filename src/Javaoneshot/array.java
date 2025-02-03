package Javaoneshot;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=100;
        marks[1]=99;
        marks[2]=100;
        System.out.println(marks[0]);

        //length
        System.out.println(marks.length);

        //sort
        System.out.println("before sorting marks of 0 is " +marks[0]);
        Arrays.sort(marks);// Arrays class has function of sort
        System.out.println("before sorting marks of 0 is " +marks[0]);
        int[] news ={77,89,70};

        //2-D arrays
        int[][] finalMarks={{98,45,65,63},{78,45,12,55}};
        System.out.println(finalMarks[0][1]);
        System.out.println(finalMarks.length);
        System.out.println(finalMarks[0].length);




    }
}
