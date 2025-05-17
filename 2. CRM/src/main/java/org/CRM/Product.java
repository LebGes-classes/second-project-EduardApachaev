package org.CRM;

public class Product {
    private String name;
    private String producer;
    private String seller;

    private WarehouseCell cell;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", seller='" + seller + '\'' +
                '}';
    }

    public Product() {
        this.name = null;
        this.producer = null;
        this.seller = null;
    }

    public Product(String name, String producer, String seller) {
        this.name = name;
        this.producer = producer;
        this.seller = seller;
    }
}
