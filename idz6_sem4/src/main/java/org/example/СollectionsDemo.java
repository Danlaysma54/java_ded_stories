package org.example;

import java.util.ArrayList;

class CollectionsDemo {
    public int NumbOfStrings(ArrayList<String> list, String ch) {
        int numb = 0;
        for (String str : list) {
            if (str.startsWith(ch)) {
                numb++;
            }
        }
        return numb;
    }
}
