package Javaoneshot;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //for loop
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
        for (int i=10;i>=1;i--){
            System.out.println(i);
        }

        //while loop
        int i=10;
        while (i>=1){
            System.out.println(i);
            i--;
        }

        //do-while
        int j=10;
        do{
            System.out.println(j);
            j--;
        }
        while (j>=1);


        Scanner sc =new Scanner(System.in);
        int num;
        do{
            System.out.print("enter a positive number : ");
            num=sc.nextInt();
            System.out.print("The number is : ");
            System.out.println(num);
        }
        while (num>0);
        System.out.println("out of loop ");



        // break and continue
        int l=0;
        while(true){
            if(l==2){
                l++;
                continue;
            }
            System.out.println(l);
            l++;
            if(l>5)
                break;
        }


        //advanced for loop
        int[] numbers={87,98,66,22,35,66};
        for(int nums:numbers){
            System.out.println( nums);
        }



    }
}
