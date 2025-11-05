package exercicio_5.entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = subTotal();;
    }

    public Double subTotal() {
        return this.product.getPrice() * getQuantity();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }
}
