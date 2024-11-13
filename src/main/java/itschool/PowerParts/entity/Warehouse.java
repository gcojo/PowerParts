package itschool.PowerParts.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@Entity
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String location;
    @OneToMany(mappedBy = "warehouse")
    private Set<Product> products = new HashSet<>();

}
