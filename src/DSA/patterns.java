package DSA;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {

        //rectangle
        int i,j,k;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns :");
        int columns=sc.nextInt();
        for( i=0;i<rows;i++){

            for( j=0;j<columns;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }



        //holo rectangle
        for(i=0;i<rows;i++){
            for(j=0;j<columns;j++){
                if(i==0||j==0||i==rows-1||j==columns-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



        //half pyramid
        for (  i = 0; i < rows; i++) {

            for ( j = 0; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }



        //inverted half pyramid
        for (  i = rows-1; i>=0; i--) {

            for ( j = 0; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }




        //inverted half pyramid but 180 rotated
        for (  i = rows-1; i >=0; i--) {

            for ( j = 0; j < i ; j++) {
                System.out.print("  ");

            }
            for (  k = 0; k < rows-i; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }




        //half pyramid with numbers
        for(i=0;i<rows;i++){
            for (  j = 0; j <= i; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }



        //
        for(i=0;i<rows;i++){
            for (  j = 0; j <rows-i; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }



        //Floyd's triangle
        k=0;
        for (  i = 0; i < rows; i++) {

            for ( j = 0; j <= i ; j++) {

                System.out.print(k+" ");
                k++;

            }
            System.out.println();
        }



        //0-1 triangle
        for (  i = 0; i < rows; i++) {

            for ( j = 0; j <= i ; j++) {
                 if((i+j)%2==0){
                     System.out.print("1");
                 }
                 else {
                     System.out.print("0");
                 }

            }
            System.out.println();
        }






    }
}
