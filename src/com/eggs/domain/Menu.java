package com.eggs.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    
    private Restaurant restaurant;
    private Map<String, Food> foodMap = new HashMap<String, Food>();
    
    // TODO remove this and add MenuBuilder instead
    Menu() {
        
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<Food> getFoodList() {
        ArrayList<Food> list = new ArrayList<Food>(foodMap.values());
        return list;
    }

    public void setFoodList(List<Food> foodList) {
        for (Food food : foodList) {
            addFood(food);
        }
    }

    public void setFoodMap(Map<String, Food> foodMap) {
        this.foodMap = foodMap;
    }

    public void addFood(Food food) {
        foodMap.put(food.getId(), food);
    }
}
