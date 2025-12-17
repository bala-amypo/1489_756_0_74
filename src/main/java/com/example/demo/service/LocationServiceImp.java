package com.example.demo.service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;
import com.example.demo.service.LocationService;

public class LocationServiceImp implements LocationService {
    @Autowired
    LocationRepository Locationrepo;
    @Override
    public LocationEntity createlocation(LocationEntity le){
        return Locationrepo.save(le);
      public List<LocationEntity> getall(){
        return Locationrepo.findAll();
      }
    }

}
