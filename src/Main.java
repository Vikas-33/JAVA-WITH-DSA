//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            String a= "vikas kumar";//not fixed size //strings are immutable
            String b = "k";
            System.out.println(a);
            System.out.println(a.length());
// operations on string
            System.out.println(a +" "+ b);
            //charAt
            System.out.println(a.charAt(0));
            //replace
            String c=a.replace('v','n');
            System.out.println(c);
            //substring
            System.out.println(a.substring(0,4));
        }
    }
}