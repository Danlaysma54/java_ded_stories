
public class Main {
    public static void main(String[] args) {
        String str = new String("abcabcdabcab");
        String str_1 = new String("abc");
        String str_2 = new String("ab");
        String str_3 = new String("123");
        StringBuilder str_4 = new StringBuilder("hahahahahahaha");
        int numb = 2;
        try {
            str_1 = repeat_Str(str, numb);
            System.out.println(str);
        } catch (IllegalArgumentException e) {
            System.err.println("Введено отрицательное число");
        }
        try {
            System.out.println(numb_to_string(str_3));
            System.out.println(consist_numb(str_1, str_2));
            System.out.println(delete_smth(str_4));
        } catch (IllegalArgumentException r) {
            System.err.println("Введена нулевая строка");
        }

    }

    public static int consist_numb(String s1, String s2) {
        if (s2.length() == 0 || s2 == null) {
            throw new IllegalArgumentException("Нулевая строка");
        }
        int z = 0;
        int n = s2.length();
        int numb = 0;
        for (int i = 0; i < s1.length(); i += 3) {
            if (s1.substring(z, n).equals(s2)) {
                n += 3;
                z += 3;
                numb++;
            }
        }
        return numb;
    }

    public static String repeat_Str(String s, int N) {
        if (N < 0) {
            throw new IllegalArgumentException("Отрицательный параметр N");
        }
        String str = new String();
        for (int i = 0; i < N; i++) {
            str += s;
        }
        return str;

    }

    public static String numb_to_string(String str) {
        if (str.length() == 0 || str == null) {
            throw new IllegalArgumentException("Нулевая строка");
        }
        String str_1 = new String();
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("1")) {
                str_1 += "один";
            }
            if (str.substring(i, i + 1).equals("2")) {
                str_1 += "два";
            }
            if (str.substring(i, i + 1).equals("3")) {
                str_1 += "три";
            }
        }
        return str_1;
    }

    public static StringBuilder delete_smth(StringBuilder str) {
        if (str.length() == 0 || str == null) {
            throw new IllegalArgumentException("Нулевая строка");
        }
        for (int i = 0; i < str.length(); i ++) {
            str.delete(i+1, i+2);
        }
        return str;
    }
}



