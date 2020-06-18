package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CategoryController {
    CategoryStorage categoryStorage;

    public CategoryController(CategoryStorage categoryStorage) {
        this.categoryStorage = categoryStorage;
    }

    @GetMapping("categories/{category}")
    public String showSingleCategory(@PathVariable String category, Model model) {
        model.addAttribute("category", categoryStorage.findCategoryByName(category));
        model.addAttribute("categories", categoryStorage.getAllCategories());
        return "category-template";
    }

    @PostMapping("categories/add")
    public String addCategory(String category) {
        if (categoryStorage.findCategoryByName(category) != null) {
            return "redirect:/";
        }
        Category categoryToAdd = new Category(category);
        categoryStorage.addCategory(categoryToAdd);
        return "redirect:/";
    }


}


