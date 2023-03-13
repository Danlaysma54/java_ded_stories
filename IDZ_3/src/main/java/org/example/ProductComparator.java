package org.example;

public class ProductComparator implements Comparator<Product> {

    public int compare(Product a, Product b) {
        int res = a.GetProductName().compareTo(b.GetProductName());
        if (res != 0) return res;
        res = a.GetProductDescription().compareTo(b.GetProductDescription());
        return res;
    }
}
