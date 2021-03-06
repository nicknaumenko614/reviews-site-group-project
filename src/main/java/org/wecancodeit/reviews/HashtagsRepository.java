package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface HashtagsRepository extends CrudRepository<Hashtags, Long> {
    Hashtags findByHashtag(String name);
}
