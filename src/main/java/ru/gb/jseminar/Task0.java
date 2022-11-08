package ru.gb.jseminar;

import java.util.logging.Logger;

public class Task0 {

    // Даны следующие строки, cравнить их с помощью == и метода equals()
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
    public static void main(String[] args) {
        Task0 ste = new Task0();
        String[] s = new String[]{ste.s1, ste.s2, ste.s3, ste.s4, ste.s5,ste.s6};
        for (String s0: s) {
            for (String s1: s) {
                ste.stringEquals(s0,s1);
            }
        }

    }
    public void stringEquals(String s0, String s1) {
//        Logger log = Logger.getLogger(Task0.class.getName());
//        log.info(String.format("String %s & String %s with == is %b", s0, s1, s0 == s1));
//        log.info(String.format("String %s & String %s with equals is %b", s0, s1, s0.equals(s1)));
        System.out.println(String.format("String %s & String %s with == is %b", s0, s1, s0 == s1));
        System.out.println(String.format("String %s & String %s with equals is %b", s0, s1, s0.equals(s1)));
//        String.valueOf(s0.equals(s1)));
    }

}
