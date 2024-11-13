package itschool.PowerParts.controller;

import itschool.PowerParts.entity.Customer;
import itschool.PowerParts.entity.Product;
import itschool.PowerParts.entity.Category;
import itschool.PowerParts.exception.ProductNotFoundException;
import itschool.PowerParts.service.CustomerService;
import itschool.PowerParts.service.ProductService;
import itschool.PowerParts.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String listProducts(Model model) {
        try {
            model.addAttribute("products", productService.getAllProducts());
            return "product-list";
        }
     catch (ProductNotFoundException e) {
        model.addAttribute("errorMessage", e.getMessage());
        return "error";
    }
    }

    @GetMapping("/add")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "product-form";
    }

    @PostMapping("/add")
    public String addProduct(@RequestParam String name,
                             @RequestParam double price,
                             @RequestParam String description,
                             @RequestParam int stock,
                             @RequestParam int customerId) {
        Customer selectedCustomer = customerService.getCustomerById(customerId);
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);
        product.setStock(stock);
        product.setCustomer(selectedCustomer);
        productService.saveProduct(product);
        return "redirect:/products";
    }


    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int productId) {
        Optional<Product> optionalProduct = productService.getProductById(productId);

        // Check if product exists, and delete it if present
        optionalProduct.ifPresent(product -> productService.deleteProduct(productId));

        return "redirect:/products";
    }

    @GetMapping("/list")
    public String listProductsWithWarehouse(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "warehouse-list";
    }


}


