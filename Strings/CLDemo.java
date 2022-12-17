package Strings;
// enter words after java CLDemo.java in the CLI
public class CLDemo {
    public static void main(String[] args) {
        System.out.println("there are " + args.length + " command line arguments");

        System.out.println("they are: ");
        for (int i = 0 ; i < args.length ; i++){
            System.out.println("Arg[" + i + "] :" + args[i]);
        }
    }
}
