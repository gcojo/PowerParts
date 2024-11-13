package itschool.PowerParts.repository;

import itschool.PowerParts.entity.Category;
import itschool.PowerParts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category,Integer> {
}
