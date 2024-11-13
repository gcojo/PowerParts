package itschool.PowerParts.service;

import itschool.PowerParts.entity.Category;
import itschool.PowerParts.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();  // Get all categories from the database
    }
    // Add more business logic methods if needed
}
