package org.example;

public class StringService {
    public int NumbOfStrEquals(String[] array_str, String str_1) { // В массиве строк найти количество элементов, равных заданной строке.
        int count = 0;
        for (String str : array_str) {
            if (str_1.equals(str)) {
                count++;
            }
        }
        return count;
    }

    public int NumbOfFirstSymEquals(String[] array_str, String sym) { // В массиве строк найти количество строк, начинающихся на заданный символ.
        int count = 0;
        for (String str : array_str) {
            if (str.startsWith(sym)) {
                count++;
            }
        }
        return count;
    }

    public String ThelongestString(String[] array_str) { // В строке найти минимальное слово максимальной длины (первое такое, если их несколько).
        String max = new String();
        for (int i = 0; i < array_str.length; i++) {
            if (max.length() < array_str[i].length())
                max = new String(array_str[i]);
            if (max.length() == array_str[i].length()) {
                if (max.compareTo(array_str[i]) < 0)
                    max = new String(array_str[i]);
            }
        }
        return max;
    }

    public int NotConsistStr(String[] array_str, String str) { // В массиве строк найти количество строк, которые не содержат заданную подстроку.
        int numb = 0;
        for (int i = 0; i < array_str.length; i++) {
            if (!array_str[i].contains(str))
                numb++;
        }
        return numb;
    }

}

