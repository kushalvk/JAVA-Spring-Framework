package com.vk.app.repo;

import com.vk.app.model.Laptop_03;
import org.springframework.stereotype.Repository;

@Repository // samework as '@Component'
public class LaptopRepository {
    public void save(Laptop_03 lap) {
        System.out.println("Save in database...");
    }
}
