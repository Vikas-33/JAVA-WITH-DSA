package JAVA;

public class string {
    public static void main(String[] args) {


        String a = "vikas kumar";//not fixed size //strings are immutable
        String b = "k";
        System.out.println(a);
        System.out.println(a.length());
// operations on string
        System.out.println(a + " " + b);
        //charAt
        System.out.println(a.charAt(0));
        //replace
        String c = a.replace('v', 'n');
        System.out.printf(c);
        //substring
        System.out.println(a.substring(0, 4));
    }
}
