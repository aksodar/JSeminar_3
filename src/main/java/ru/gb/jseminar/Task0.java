package ru.gb.jseminar;

public class Task0 {

   // Даны следующие строки, cравнить их с помощью == и метода equals()
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        Task0 task0 = new Task0();

        System.out.println("==");
        task0.IsSame(s1, s2);
        task0.IsSame(s2, s4);
        task0.IsSame(s1, s3);
        System.out.println("Equals");
        task0.Equals(s1, s2);
        task0.Equals(s4, s6);
        task0.Equals(s1, s4);
        
        String s7 = "hello";
        String s8 = "Hello";
        System.out.println(s7.equalsIgnoreCase(s8));
    }
    public void IsSame (Object a, Object b){
        System.out.println(a == b);
    }

    public void Equals (Object a, Object b){
        System.out.println(a.equals(b));
    }

}
