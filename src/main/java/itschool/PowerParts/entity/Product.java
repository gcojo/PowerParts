package itschool.PowerParts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    private String description;

    @Column(nullable = false)
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Product(String name, double price, String description, int stock, Customer customer) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.customer = customer;
    }

    @ManyToMany
    @JoinTable(
            name = "product_category",  // Join table name
            joinColumns = @JoinColumn(name = "product_id"),  // Foreign key in product_category
            inverseJoinColumns = @JoinColumn(name = "category_id")  // Foreign key in product_category
    )
    private Set<Category> categories = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "warehouse_id")  // This is the foreign key to reference the Warehouse
    private Warehouse warehouse;
}
