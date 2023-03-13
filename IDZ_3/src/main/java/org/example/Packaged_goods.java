package org.example;

public class Packaged_goods extends Product {
    private final Product_Packaging product_packaging;
    private final double weight;

    Packaged_goods(Product product, Product_Packaging input, double weight) {
        super(product.GetProductName(), product.GetProductDescription());
        this.product_packaging = new Product_Packaging(input.GetPackageWeight(), input.GetPackageName());
        this.weight = weight;
    }

    public double GetWeight() {
        return weight;
    }

    public Product_Packaging GetProductPackaging() {
        return this.product_packaging;
    }

    public boolean equals(Packaged_goods input) {
        return this.GetProductName().equals(input.GetProductName()) && this.GetProductDescription().equals(input.GetProductDescription()) && this.product_packaging.equals(input.product_packaging);
    }

    @Override
    public int hashCode() {
        return this.product_packaging.hashCode() + this.GetProductName().hashCode() + this.GetProductDescription().hashCode();
    }

    @Override
    public String toString() {
        return this.product_packaging.toString() + " " + this.GetProductName() + " " + this.GetProductDescription() + "\n";
    }
}
