package itschool.PowerParts.repository;
import itschool.PowerParts.entity.Category;
import itschool.PowerParts.entity.Customer;
import itschool.PowerParts.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByCustomer(Customer customer);

}
