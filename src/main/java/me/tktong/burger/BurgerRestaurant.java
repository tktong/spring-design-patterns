package me.tktong.burger;

import me.tktong.restaurant.Restaurant;
import me.tktong.restaurant.RestaurantOrder;
import org.springframework.stereotype.Component;

@Component
class BurgerRestaurant implements Restaurant {
    @Override
    public boolean order(RestaurantOrder order) {
        return true;
    }

    @Override
    public String getName() {
        return "burger";
    }
}
