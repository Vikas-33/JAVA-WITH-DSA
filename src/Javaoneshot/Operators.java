package Javaoneshot;

public class Operators {
    public static void main(String[] args) {
        //ops
        int a=7;
        int b=3;
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        double div=a/b;
        System.out.println("addition = "+add);
        System.out.println("subtraction = "+sub);
        System.out.println("multiplication = "+mul);
        System.out.println("division = "+div);
        double modulo=a%b;
        System.out.println("modulo ="+modulo);

        //unary ops
        a++;
        System.out.println("increased a = "+a);
        a--;
        System.out.println("decrised a ="+a);


    }
}
