package org.example;

import java.util.ArrayList;

public class Packed_set_of_goods extends Packaged_goods {
    private Product_Packaging product_packaging;
    private final Packaged_goods[] packaged_goods;

    Packed_set_of_goods(Product product, Product_Packaging product_packaging,double weight, Packaged_goods... packaged_goods) {
        super(product, product_packaging,weight);
        this.packaged_goods = new Packaged_goods[packaged_goods.length];
        System.arraycopy(packaged_goods, 0, this.packaged_goods, 0, packaged_goods.length);
        this.product_packaging = product_packaging;

    }

    public double GetWeightNetto() {
        double netto = 0;
        for (Packaged_goods packaged_good : packaged_goods) {
            netto += packaged_good.GetProductPackaging().GetPackageWeight();
        }
        return netto;
    }

    public double GetWeightBrutto() {
        double brutto = 0;
        for (Packaged_goods packaged_good : packaged_goods) {
            brutto += packaged_good.GetProductPackaging().GetPackageWeight();
        }
        brutto += this.product_packaging.GetPackageWeight();
        return brutto;
    }

    public boolean equals(Packed_set_of_goods packed_set_of_goods) {
        boolean flag = true;
        if (packed_set_of_goods.packaged_goods.length != this.packaged_goods.length)
            return false;
        else {
            for (int i = 0; i < this.packaged_goods.length; i++) {
                flag = this.packaged_goods[i].equals(packed_set_of_goods.packaged_goods[i]);
                if (!flag)
                    return false;
            }
            return this.product_packaging.equals(packed_set_of_goods.product_packaging);
        }
    }

    @Override
    public int hashCode() {
        int code = 0;
        for (Packaged_goods packaged_good : packaged_goods) {
            code += packaged_good.hashCode();
        }
        code += product_packaging.hashCode();
        return code;
    }

    @Override
    public String toString() {
        String str = new String();
        str += this.product_packaging.toString();
        for (Packaged_goods packaged_good : packaged_goods) {
            str += packaged_good.toString();
        }
        return str;
    }
}
