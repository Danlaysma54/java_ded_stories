package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class  ComparatorDemo {
  public static<T>  void sortGoods(Comparator<? super T> c,T[] array){
Arrays.sort(array,c);
    }
}
