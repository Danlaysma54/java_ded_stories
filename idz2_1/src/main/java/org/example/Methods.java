package org.example;

public class Methods {
    public int consist_numb(String s1, String s2) {
        if (s2.length() != 0 && s2 != null) {
            int z = 0;
            int n = s2.length();
            int numb = 0;

            for (int i = 0; i < s1.length(); i += 3) {
                if (s1.substring(z, n).equals(s2)) {
                    n += 3;
                    z += 3;
                    ++numb;
                }
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

    public StringBuilder delete_smth(StringBuilder str) {
        if (str.length() != 0) {
            for (int i = 0; i < str.length(); ++i) {
                str.delete(i + 1, i + 2);
            }

            return str;
        } else {
            throw new IllegalStateException("Нулевая строка");
        }
    }
}
