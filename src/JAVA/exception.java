package JAVA;

public class exception {
    public static void prnt() {
        System.out.println("java");


    }
    public static void name(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        //TRY-CATCH in EXCEPTION HANDLING
        int[] marks ={97,98,55};
        try{
            System.out.print(marks[5]);
        } catch(Exception exception){
            //do something after catching
        }

        System.out.println(" is marks of vikas");




        // methods
        prnt();
        prnt();
        name("vikas");

    }
}
