package org.example;

import org.example2.BeginStringFilter;

public class Product_service {
    static int CountByFilter(batch_of_goods input, String str) {
        int count = 0;
        for (Packaged_goods packaged_goods : input.GetPackedGoods()) {
            BeginStringFilter filter = new BeginStringFilter(packaged_goods.GetProductName());
            if (filter.apply(str)) {
                count++;
            }
        }
        return count;
    }
}
