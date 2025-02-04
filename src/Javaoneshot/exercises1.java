package Javaoneshot;

import java.util.Scanner;

public class exercises1 {
    public static void main(String[] args) {

        //calculate %
        double sub1=100;
        double sub2=90;
        double sub3=80;
        double sub4=60;
        double sub5=70;
        double pr=(sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("The total percentage of the student is : "+pr+" %");


        //area of circle
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        double radius=sc.nextDouble();

        double area=3.14*radius*radius;
        System.out.println("The area of this circle is :"+area);


        //sum of 2 input numbers
        System.out.print("Enter the first number :");
        int num1=sc.nextInt();
        System.out.print("Enter the second number :");
        int num2=sc.nextInt();
        System.out.println("The sum is :"+(num1+num2));




    }
}
