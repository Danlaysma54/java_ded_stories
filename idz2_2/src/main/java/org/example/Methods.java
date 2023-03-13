package org.example;

import java.util.ArrayList;
import java.util.Stack;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseUnsignedInt;

public class Methods {
    public int consist_numb(String s1, String s2) {
        if (s2.length() != 0) {
            int z = 0;
            int n = s2.length();
            int n1 = s2.length();
            int numb = 0;
            int i = 0;

            while (i < s1.length()) {
                if (s1.substring(z, n).equals(s2)) {
                    n += n1;
                    z += n1;
                    ++numb;
                }
                i += 3;
            }
            return numb;
        } else {
            throw new IllegalStateException("Нулевая строка");
        }
    }

    public String repeat_Str(String s, int N) {
        if (N < 0) {
            throw new IllegalArgumentException("Отрицательный параметр N");
        } else {
            String str = new String();

            for (int i = 0; i < N; ++i) {
                str = str + s;
            }

            return str;
        }
    }

    public String numb_to_string(String str) {
        if (str.length() != 0) {
            String str_1 = new String();

            for (int i = 0; i < str.length(); ++i) {
                if (str.substring(i, i + 1).equals("1")) {
                    str_1 = str_1 + "один";
                }

                if (str.substring(i, i + 1).equals("2")) {
                    str_1 = str_1 + "два";
                }

                if (str.substring(i, i + 1).equals("3")) {
                    str_1 = str_1 + "три";
                }
            }

            return str_1;
        } else {
            throw new IllegalStateException("Нулевая строка");
        }
    }

    public String delete_smth(StringBuilder str) {
        if (str.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                str.delete(i, i + 1);
            }
            return new String(str);
        } else {
            throw new IllegalStateException("Нулевая строка");
        }
    }

    public String Invert2(String str) {
        StringBuilder str_1 = new StringBuilder();
        char[] arr = str.toCharArray();
        Stack<Character> st = new Stack<Character>();
        ArrayList<Character> list = new ArrayList<>();
        int i = arr.length - 1;
        int numb = 0;
        boolean flag = true;
        do {
            while (numb <= arr.length - 1 && arr[numb] == ' ') {
                list.add(arr[numb]);
                numb++;
                flag = true;
            }
            while (i >= 0 && arr[i] != ' ' && flag) {
                st.push(arr[i]);
                i--;
            }
            while (!st.empty()) {
                list.add(st.pop());
                flag = false;
            }
            if (!flag || i < 0) {
                numb++;
            }
            if (flag || numb >= arr.length) {
                i--;
            }
        } while (numb <= arr.length - 1 || i >= 0);
        for (Character character : list) {
            str_1.append(character);
        }
        return new String(str_1);
    }

    public String Convertor(String str) {
        StringBuilder str_1 = new StringBuilder(str);
        while (str_1.indexOf("0x") != -1) {
            String test = new String(str_1.substring(str_1.indexOf("0x") + 2, str_1.indexOf("0x") + 10));
            String numb_1 = Integer.toString(parseUnsignedInt(test, 16));
            str_1.replace(str_1.indexOf("0x"), str_1.indexOf("0x") + 10, numb_1);
        }
        return new String(str_1);
    }
}
