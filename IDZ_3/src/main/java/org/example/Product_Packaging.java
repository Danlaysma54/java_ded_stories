package org.example;

public class Product_Packaging {
    private double package_weight;
    private String package_name;

    Product_Packaging(double weight, String name) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight can't be negative size");
        }
        if (name == null) {
            throw new NullPointerException("The name has null link");
        }
        this.package_weight = weight;
        this.package_name = new String(name);
    }

    public double GetPackageWeight() {
        return this.package_weight;
    }

    public String GetPackageName() {
        return this.package_name;
    }

    public void SetPackageWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight can't be negative size");
        }
        this.package_weight = weight;
    }

    public void SetPackageName(String name) {
        if (name == null) {
            throw new NullPointerException("The name has null link");
        }
        this.package_name = new String(name);
    }

    public boolean equals(Product_Packaging input) {
        return (this.package_weight == input.package_weight && this.package_name.equals(input.package_name));
    }

    @Override
    public String toString() {
        String str = new String();
        str += String.format("Name: %s,weight: %.2f gr.", this.package_name, this.package_weight);
        return str;
    }

    @Override
    public int hashCode() {
        int i = 0;
        i += this.package_weight;
        i += this.package_name.hashCode();
        return i;
    }
}
