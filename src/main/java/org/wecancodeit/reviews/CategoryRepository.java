package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findByCategoryName(String name);
}
