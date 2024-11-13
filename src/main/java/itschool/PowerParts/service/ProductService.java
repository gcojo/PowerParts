package itschool.PowerParts.service;

import itschool.PowerParts.entity.Category;
import itschool.PowerParts.entity.Customer;
import itschool.PowerParts.entity.Product;
import itschool.PowerParts.repository.CategoryRepository;
import itschool.PowerParts.repository.CustomerRepository;
import itschool.PowerParts.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(Integer categoryId) {
        Optional<Customer> customer  = customerRepository.findById(categoryId);
        if (customer.isPresent()) {
            return productRepository.findByCustomer(customer.get());
        }
        return List.of();
    }

    public void saveProduct(final Product product) {
        productRepository.save(product);
    }


    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }



    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
