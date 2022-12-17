package Strings;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = new String("This is first string");
        String str2 = "This is second string";
        String str3 = new String(str2);  // constructing a string from an existing string

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
