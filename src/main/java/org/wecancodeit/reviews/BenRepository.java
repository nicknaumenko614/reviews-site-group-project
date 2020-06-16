package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface BenRepository extends CrudRepository<Ben, Long> {
    Ben findByName(String name);
}
