package DSA;

import java.util.Scanner;

public class advancePatterns {
    public static void main(String[] args) {
        int i,j,k;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int rows=sc.nextInt();


//        butterfly pattern
        for (  i = 0; i <(rows/2) ; i++) {
            for (  j = 0; j < rows ; j++) {
                if (j==0||j==rows-1||i==rows/2) {
                    System.out.print("* ");

                } else if ((i+j)<=(i+i) || (i+j)>=rows-1) {
                    System.out.print("* ");



                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
        for(i=(rows/2);i<rows;i++){
            for(j=0;j<=rows-1;j++){
                if(i==rows/2){
                    System.out.print("* ");

                } else if ((i+j)<rows) {
                    System.out.print("* ");

                } else if ((i+j)>=(i+i)) {
                    System.out.print("* ");

                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }






        for(i=0;i<=rows;i++){
            for(j=0;j<=((2*rows)-i);j++){
                if((i+j)<=(rows-1)){
                    System.out.print("  ");

                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }





        for (i=0;i<rows;i++){
            for(j=0;j<(rows+i);j++){
                if((i+j+1)>=(rows-1)&&(i+j)%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
//
//
//
//
//
//
//        //
        for(i=0;i<rows;i++){
            for(j=0;j<rows-i;j++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }




        //
        for(i=0;i<rows;i++){
            for(j=i;j<rows-1;j++){
                System.out.print("_");
            }

            for(k=0;k<((2*i)+1) ;k++){
                System.out.print("*");

            }
            System.out.println();
        }



    }
}
