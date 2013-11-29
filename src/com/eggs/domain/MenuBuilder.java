package com.eggs.domain;


public class MenuBuilder {

    private Menu menu;
    
    public MenuBuilder(String restaurantName) {
        menu = new Menu();
        menu.setRestaurant(new Restaurant(restaurantName));
    }

    public MenuBuilder food(String id, String name, float price) {
        menu.addFood(new Food(id, name, price));
        return this;
    }

    public Menu build() {
        return menu;
    }
}
