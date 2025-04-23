package com.restaurant.Restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "menuItems")
public class MenuItem {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private String imagePath;
    private String restaurantId;  // Reference to Restaurant
}
