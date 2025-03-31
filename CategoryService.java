package sheetal.nimap.example.sheetal_NimapApplication.service;

import sheetal.nimap.example.sheetal_NimapApplication.model.Category;

import java.util.List;

public interface CategoryService {

    Category addCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
}
