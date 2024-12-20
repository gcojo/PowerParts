package itschool.PowerParts.repository;

import itschool.PowerParts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Customer findByName(String name);
}
