package JAVA;
import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        //import java.util.Scanner;

//       count digits in number
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int count=0;
        if (n==0){
            System.out.println("The digit count in number is: "+count);
        }
        else {
            while (n > 0) {
                n /= 10;
                count++;
            }
        }
        System.out.println("The count of digits is: "+count);







//        sum of digits of a number
//        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
//        int n=sc.nextInt();
        int sum=0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("The sum of digits is: "+sum);






//        reverse a number
        System.out.print("Enter the number: ");
        int x= sc.nextInt();
        int reversenumber;
        while (x>0){
            reversenumber=x%10;
            x/=10;
            System.out.print(reversenumber);
        }



    }
}
