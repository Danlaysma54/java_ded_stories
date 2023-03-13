package org.example;

public class Packed_weight_goods extends Packaged_goods {

    Packed_weight_goods(Product product, Product_Packaging product_packaging, double weight) {
        super(product, product_packaging, weight);
    }

    public double GetWeightNetto() {
        return this.GetWeight();
    }

    public double GetWeightBrutto() {
        return this.GetWeight() + this.GetProductPackaging().GetPackageWeight();
    }

    public double GetWeightProduct() {
        return this.GetWeight();
    }

    public boolean equals(Packed_weight_goods input) {
        return this.GetWeight() - input.GetWeight() < Math.pow(10, -5) &&
                this.GetProductPackaging().GetPackageName().equals(input.GetProductPackaging().GetPackageName())
                && this.GetProductPackaging().GetPackageWeight() - input.GetWeightProduct() < Math.pow(10, -5)
                && this.GetProductName().equals(input.GetProductName())
                && this.GetProductDescription().equals(input.GetProductDescription());
    }

    @Override
    public String toString() {
        String str = new String();
        str += String.format("Package name %s,Package weight %.2f gr,Product name %s,Product description %s,Product weight %.2f gr", this.GetProductPackaging().GetPackageName(),
                this.GetProductPackaging().GetPackageWeight(), this.GetProductName(), this.GetProductDescription(), this.GetWeight());
        return str;
    }

    @Override
    public int hashCode() {
        int code = 0;
        code += this.GetProductPackaging().hashCode();
        code += this.GetProductName().hashCode();
        code += this.GetProductDescription().hashCode();
        code += this.GetWeight();
        return code;
    }
}
