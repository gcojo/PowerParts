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

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/products/{id}")
    public String getProduct(@PathVariable int id, Model model) {  // Use int here, not Long
        try {
            Product product = productService.getProductById(id);
            model.addAttribute("product", product);
            return "product-details";
        } catch (ProductNotFoundException e) {
            model.addAttribute("errorMessage", e.getMessage());
            return "error"; // Return an error page
        }
    }
    @GetMapping
    public String listProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product-list";
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

//        if (selectedCustomer == null) {
//            // Add error message to the model if customer is not found
//            model.addAttribute("errorMessage", "Invalid or missing Customer ID.");
//            return "product-form";  // Return to the product form with the error message
//        }

        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);
        product.setStock(stock);
        product.setCustomer(selectedCustomer);

        productService.saveProduct(product);  // Save the product

        return "redirect:/products";
    }


    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int productId) {
        // Check if product exists before deleting
        Product product = productService.getProductById(productId);
        if (product != null) {
            productService.deleteProduct(productId);  // Delete the product
        }
        return "redirect:/products";  // Redirect back to the product list after deletion
    }

    @GetMapping("/list")
    public String listProductsWithWarehouse(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "warehouse-list";
    }


}


