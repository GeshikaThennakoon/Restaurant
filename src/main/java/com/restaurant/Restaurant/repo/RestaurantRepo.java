package com.restaurant.Restaurant.repo;


import com.restaurant.Restaurant.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RestaurantRepo extends MongoRepository<Restaurant,String> {
    List<Restaurant> findByOwnerName(String ownerName);


}
