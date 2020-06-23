package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findByCategoryName(String name);
}
