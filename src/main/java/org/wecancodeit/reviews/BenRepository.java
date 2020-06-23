package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface BenRepository extends CrudRepository<Ben, Long> {
    Ben findByName(String name);
}
