package com.vk.app.service;

import com.vk.app.LaptopRepository;
import com.vk.app.model.Laptop_03;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // '@Service' is work as a '@Component'
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addlaptop(Laptop_03 lap) {
        repo.save(lap);
    }

    public boolean isGoodForPrice(Laptop_03 lap) {
        return true;
    }
}
