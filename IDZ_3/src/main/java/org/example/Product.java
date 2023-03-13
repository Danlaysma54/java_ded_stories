package org.example;

public class Product {
    private String product_name;
    private String product_description;

    Product(String product_name, String product_description) {
        if (product_name == null || product_description == null) {
            throw new NullPointerException("The  product name or description has null link");
        }
        this.product_name = new String(product_name);
        this.product_description = new String(product_description);
    }

    public String GetProductName() {
        return this.product_name;
    }

    public String GetProductDescription() {
        return this.product_description;
    }

    public void SetProductName(String product_name) {
        if (product_name == null) {
            throw new NullPointerException("The product name has null link");
        }
        this.product_name = product_name;
    }

    public void SetProductDescription(String product_description) {
        if (product_name == null) {
            throw new NullPointerException("The description has null link");
        }
        this.product_description = product_description;
    }

    public boolean equals(Product input) {
        return this.product_name.equals(input.product_name) && this.product_description.equals(input.product_description);
    }
@Override
    public int hashCode() {
        int code = 0;
        code += this.product_description.hashCode();
        code += this.product_name.hashCode();
        return code;
    }
@Override
    public String toString() {
        String str = new String();
        str += String.format("%s %s", this.product_name, this.product_description);
        return str;
    }

}
