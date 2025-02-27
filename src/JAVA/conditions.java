package JAVA;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        boolean sunUp= false;
        if(sunUp==true)
            System.out.println("It,s  day .");
        else
            System.out.println("It,s night");


        // logical ops
        //&& if bot side of conditions or values are true only then it will give true
        int a=7;
        int b=60;
        if (a<10&&b<10)
            System.out.println("both are less then 10");
        else System.out.println("both are not less then 10");


        // ||  if any of one condition or value is true then it will give true
        if(a<10||b<10)
            System.out.println("at least 1 value is less then 10");
        else System.out.println("both are not less then 10");

        //! it will change true to false and false to true
        if(!sunUp)
            System.out.println("It,s  day .");
        else
            System.out.println("It,s night");


        //switch
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number ");
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid number : ");

        }

    }
}
