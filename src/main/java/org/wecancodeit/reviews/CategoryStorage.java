package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CategoryStorage {
CategoryRepository categoryRepo;

    public CategoryStorage(CategoryRepository categoryRepo) {
        this.categoryRepo=categoryRepo;
    }

    public Category findCategoryByName(String category) {
        return categoryRepo.findByCategoryName(category);

    }

    public Iterable<Category> getAllCategories() {
        return categoryRepo.findAll();
    }
}
