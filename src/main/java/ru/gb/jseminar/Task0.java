package ru.gb.jseminar;

public class Task0 {

    // Даны следующие строки, cравнить их с помощью == и метода equals()
    // String s1 = "hello";
    // String s2 = "hello";
    // String s3 = s1;
    // String s4 = "h" + "e" + "l" + "l" + "o";
    // String s5 = new String("hello");
    // String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println(s1.equalsIgnoreCase(s6));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
    }

}
