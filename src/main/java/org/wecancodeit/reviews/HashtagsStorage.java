package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class HashtagsStorage {

    HashtagsRepository hashtagsRepo;

    public HashtagsStorage(HashtagsRepository hashtagsRepo) {
        this.hashtagsRepo = hashtagsRepo;
    }

    public Hashtags findHashtagByName(String hashtag) {
        return hashtagsRepo.findByHashtag(hashtag);

    }

    public Iterable<Hashtags> getAllHashtags() {
        return hashtagsRepo.findAll();
    }

    public void addHashtags(Hashtags hashtagsToAdd) {
        hashtagsRepo.save(hashtagsToAdd);
    }
}
