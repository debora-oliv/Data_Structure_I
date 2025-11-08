package list.exercicio_5.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private String status;
    private Cliente cliente;
    private List<OrderItem> orderItens;

    public Order(LocalDateTime moment, String status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
        this.orderItens = new ArrayList<>();
    }

    public Double total(List<OrderItem> orderItens) {
        Double total = 0.0;
        for (OrderItem item : orderItens) {
            total += item.subTotal();
        }
        return total;
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItens.add(orderItem);
    }

    public void removeOrderItem(OrderItem orderItem) {
        orderItens.remove(orderItem);
    }

    @Override
    public String toString() {
        return "total = " + total(this.orderItens) +
                ", moment = " + moment +
                ", status = '" + status + '\'' +
                ", cliente: " + cliente;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItens() {
        return orderItens;
    }

    public void setOrderItens(List<OrderItem> orderItens) {
        this.orderItens = orderItens;
    }
}
