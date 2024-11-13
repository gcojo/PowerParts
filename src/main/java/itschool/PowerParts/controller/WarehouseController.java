package itschool.PowerParts.controller;

import itschool.PowerParts.entity.Product;
import itschool.PowerParts.entity.Warehouse;
import itschool.PowerParts.service.ProductService;
import itschool.PowerParts.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @Autowired
    private ProductService productService;

    @GetMapping("/warehouse/list")
    public String listWarehouses(Model model) {
        List<Warehouse> warehouses = warehouseService.getAllWarehouses();
        model.addAttribute("warehouses", warehouses);
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "warehouse-list";
    }
}
