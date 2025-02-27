package JAVA;

public class casting {
    public static void main(String[] args) {
        double price=100;
        double finalPrice=price+18;// double has more capacity then int
        System.out.println(finalPrice);

//        int p=100;
//        int fp=p+18.0;    //it will give error bcs int has low capacity then double
//        System.out.println(fp);

        //explicit casting
        int p=100;
        int fp=p+(int)18.3;   // casted double value 18.3 int int value 18
        System.out.println(fp);


        //constants
        int age=30;
        age=31;
        age=32;

        final float PI=3.14F;


    }
}
