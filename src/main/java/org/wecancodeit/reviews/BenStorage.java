package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class BenStorage {

    BenRepository benRepo;

    public BenStorage(BenRepository benRepo) {
        this.benRepo = benRepo;

    }

    public Ben getBenByName(String name) {
        return benRepo.findByName(name);
    }

    public Ben findByID(long id) {
        return benRepo.findById(id).get();
    }

    public void addBen(Ben ben) {
        benRepo.save(ben);
    }
}
