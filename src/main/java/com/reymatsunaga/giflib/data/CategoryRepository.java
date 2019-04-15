package com.reymatsunaga.giflib.data;

import com.reymatsunaga.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Technology"),
            new Category(3, "Destruction"),
            new Category(2, "People")
    );

    public Category findById(int id) {
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    public List<Category> getAllCategories() {
        return  ALL_CATEGORIES;
    }

}
