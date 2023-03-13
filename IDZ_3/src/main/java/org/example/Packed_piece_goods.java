package org.example;

public class Packed_piece_goods extends Packaged_goods {
    private final int numb_of_goods;

    Packed_piece_goods(Product_Packaging input, int numb_of_goods, double weight, Product product) {
        super(product, input, weight);
        this.numb_of_goods = numb_of_goods;
    }

    public int GetNumbOfGoods() {
        return this.numb_of_goods;
    }


    public double GetWeightNetto() {
        return this.numb_of_goods * this.GetWeight();
    }

    public double GetWeightBrutto() {
        return (this.numb_of_goods * this.GetWeight()) + this.GetProductPackaging().GetPackageWeight();
    }

    public boolean equals(Packed_piece_goods packed_piece_goods) {
        return this.numb_of_goods == packed_piece_goods.numb_of_goods
                && this.GetProductPackaging().equals(packed_piece_goods.GetProductPackaging())
                && this.GetProductName().equals(packed_piece_goods.GetProductName())
                && this.GetProductDescription().equals(packed_piece_goods.GetProductDescription())
                && this.GetWeight() - packed_piece_goods.GetWeight() < Math.pow(10, -5);
    }

    @Override
    public String toString() {
        String str = new String();
        str += String.format("Package name %s,Package weight %.2f,Product name %s,Product description %s,Product weight %.2f kg,Number: %d", this.GetProductPackaging().GetPackageName(),
                this.GetProductPackaging().GetPackageWeight(), this.GetProductName(), this.GetProductDescription(), this.GetWeight(), this.numb_of_goods);
        return str;
    }

    @Override
    public int hashCode() {
        int code = 0;
        code += this.GetProductPackaging().hashCode();
        code += this.GetProductName().hashCode();
        code += this.GetProductDescription().hashCode();
        code += this.GetWeight();
        code += this.numb_of_goods;
        return code;
    }
}
