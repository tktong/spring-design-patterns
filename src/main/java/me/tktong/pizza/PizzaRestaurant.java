package me.tktong.pizza;

import me.tktong.restaurant.Restaurant;
import me.tktong.restaurant.RestaurantOrder;
import org.springframework.stereotype.Component;

@Component
class PizzaRestaurant implements Restaurant {
    @Override
    public boolean order(RestaurantOrder order) {
        // Do something to setup a pizza order
        return true;
    }

    @Override
    public String getName() {
        return "pizza";
    }
}
