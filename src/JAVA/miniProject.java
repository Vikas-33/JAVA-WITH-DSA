package JAVA;

import java.util.Scanner;

public class miniProject {
    public static void main(String[] args) {
        int num =(int)(Math.random()*100);
        System.out.println(num);
        Scanner sc=new Scanner(System.in);
        while(num>0){
            System.out.print("Guess the number : ");
            int guess = sc.nextInt();
            if (guess==num){
                System.out.println("correct the number is "+num);
                break;
            } else if (guess<0) {
                System.out.println("nice try : The number was : "+num);
                break;
            } else{
                System.out.println("take one more guess ");

            }
        }


    }
}
