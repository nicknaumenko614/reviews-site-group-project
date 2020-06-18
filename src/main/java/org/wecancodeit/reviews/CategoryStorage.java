package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CategoryStorage {
    CategoryRepository categoryRepo;

    public CategoryStorage(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public Category findCategoryByName(String category) {
        return categoryRepo.findByCategoryName(category);

    }

    public Iterable<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    public void addCategory(Category category) {
        categoryRepo.save(category);
    }


    public Optional<Category> findCategoryByID(Long id) {
        return categoryRepo.findById(id);
    }
}