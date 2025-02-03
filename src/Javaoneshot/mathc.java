package Javaoneshot;
import java.util.Scanner;

public class mathc {
    public static void main(String[] args) {
        //max,min
        int a=4;
        int b=9;
        System.out.println("maximum is "+Math.max(a,b));
        System.out.println("minimum is "+Math.min(a,b));

        //random
        System.out.println((int)(Math.random()*100));

        //input
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age ");
        int age = sc.nextInt();
        System.out.println("The age is "+age);

        System.out.println("enter your name ");
        String name =sc.next();
        System.out.println("The name is "+name);

        sc.nextLine();    // Consume the leftover newline


        System.out.println("enter your names ");
        String wName =sc.nextLine();
        System.out.println("names " +wName);



        // comparison ops
        //a==b
        //a!=b
        //a<b
        //a>b
        // a<=b
        //a>=b
    }
}
