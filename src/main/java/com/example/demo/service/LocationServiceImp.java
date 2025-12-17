package com.example.demo.service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImp implements LocationService {

    @Autowired
    private LocationRepository locationRepo;

    @Override
    public LocationEntity createlocation(LocationEntity le) {
        return locationRepo.save(le);
    }

    @Override
    public List<LocationEntity> getall() {
        return locationRepo.findAll();
    }
}
