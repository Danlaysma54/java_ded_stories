package org.example;

import java.util.ArrayList;

public class batch_of_goods {
    private final Packaged_goods[] packaged_goods;
    private final String batch_description;

    batch_of_goods(String batch_description, Packaged_goods... packaged_goods) {
        this.packaged_goods = new Packaged_goods[packaged_goods.length];
        System.arraycopy(packaged_goods, 0, this.packaged_goods, 0, packaged_goods.length);
        this.batch_description = batch_description;
    }

    public boolean equals(batch_of_goods input) {
        boolean flag = true;
        if (input.packaged_goods.length != this.packaged_goods.length)
            return false;
        else {
            for (int i = 0; i < this.packaged_goods.length; i++) {
                flag = this.packaged_goods[i].equals(input.packaged_goods[i]);
                if (!flag)
                    return false;
            }
            return this.batch_description.equals(input.batch_description);
        }
    }

    public Packaged_goods[] GetPackedGoods() {
        return this.packaged_goods;
    }

    public String getBatch_description() {
        return this.batch_description;
    }

    public double GetWeightBrutto() {
        double brutto = 0;
        for (Packaged_goods packaged_goods1 : this.packaged_goods) {
            brutto += packaged_goods1.GetWeight();
        }
        return brutto;
    }

    @Override
    public int hashCode() {
        int code = 0;
        for (Packaged_goods packed_set_of_goods : this.packaged_goods) {
            code += packed_set_of_goods.hashCode();
        }
        code += this.batch_description.hashCode();
        return code;
    }

    @Override
    public String toString() {
        String str = new String();
        str += this.batch_description + " ";
        for (Packaged_goods packed_set_of_goods : this.packaged_goods) {
            str += packed_set_of_goods.toString();
        }
        return str;
    }
}