package exercicio_5;

import exercicio_5.entities.Cliente;
import exercicio_5.entities.Order;
import exercicio_5.entities.OrderItem;
import exercicio_5.entities.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {
        Product p1 = new Product("TV", 1000.0);
        Product p2 = new Product("Mouse", 40.0);

        OrderItem oi1 = new OrderItem(2, p1);
        OrderItem oi2 = new OrderItem(4, p2);

        Cliente c1 = new Cliente("Alex Green", "greealex@gmail.com", LocalDate.of(1989, 3, 17));

        Order o1 = new Order(LocalDateTime.of(2023, 11, 3, 15, 50, 23), "Processing", c1);
        o1.addOrderItem(oi1);
        o1.addOrderItem(oi2);

        System.out.println(o1);
    }
}