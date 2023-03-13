package org.example;

public class Piece_Goods extends Product {
    private final double weight;

    Piece_Goods(double weight, String product_name, String product_description) {
        super(product_name, product_description);
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight can't be negative size");
        }
        this.weight = weight;
    }

    public double GetWeight() {
        return this.weight;
    }

    public boolean equals(Piece_Goods input) {
        return this.weight - input.weight < Math.pow(10, -5) && this.GetProductName().equals(input.GetProductName()) && this.GetProductDescription().equals(input.GetProductDescription());
    }

    @Override
    public int hashCode() {
        int code = 0;
        code += this.weight;
        code += this.GetProductDescription().hashCode();
        code += this.GetProductName().hashCode();
        return code;
    }

    @Override
    public String toString() {
        String str = new String();
        str += String.format("Product name %s,Product description %s,weight %.2f", this.GetProductName(), this.GetProductDescription(), this.weight);
        return str;
    }
}
