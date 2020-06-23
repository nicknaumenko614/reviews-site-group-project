package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

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

    public void addHashtags(Hashtags hashtagToAdd) {
        hashtagsRepo.save(hashtagToAdd);
    }
}
