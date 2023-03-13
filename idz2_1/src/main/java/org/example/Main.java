package org.example;//

import org.junit.Before;
import org.junit.Test;

// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        String str = new String("abcabcdabcab");
        String str_1 = new String("abc");
        String str_2 = new String("ab");
        String str_3 = new String("123");
        StringBuilder str_4 = new StringBuilder("hahahahahahaha");
        int numb = 1;
        str_1 = m.repeat_Str(str, numb);
        System.out.println(str);
        System.out.println(m.numb_to_string(str_3));
        System.out.println(m.consist_numb(str_1, str_2));
        System.out.println(m.delete_smth(str_4));

    }
}


