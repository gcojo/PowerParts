package itschool.PowerParts.service;

import itschool.PowerParts.entity.Warehouse;
import itschool.PowerParts.repository.ProductRepository;
import itschool.PowerParts.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;
    public List<Warehouse> getAllWarehouses(){
        return warehouseRepository.findAll();
    }
}
