package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("categories/{category}")
    public String showSingleCategory(@PathVariable String category, Model model){
        model.addAttribute("category", categoryStorage.findCategoryByName(category));
        model.addAttribute("categories", categoryStorage.getAllCategories());
    return "category-template";

    }

}

