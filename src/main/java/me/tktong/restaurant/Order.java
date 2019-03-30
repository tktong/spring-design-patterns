package me.tktong.restaurant;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

 class Order {
    private String restaurantName;
    private String name;
    private List<String> items;

    @JsonProperty("restaurant")
    String getRestaurantName() {
        return restaurantName;
    }

    void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     * Name of the person ordering
     */
    @JsonProperty("name")
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    /**
     * List of items the person is ordering from the restaurant
     */
    @JsonProperty("items")
    List<String> getItems() {
        return items;
    }

    void setItems(List<String> items) {
        this.items = items;
    }
}
