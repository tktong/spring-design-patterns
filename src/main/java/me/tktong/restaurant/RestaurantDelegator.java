package me.tktong.restaurant;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Component
class RestaurantDelegator {
    private final Map<String, Restaurant> restaurants;

    RestaurantDelegator(final Collection<Restaurant> restaurants) {
        if(restaurants == null || restaurants.isEmpty()) {
            this.restaurants = Collections.emptyMap();
        }
        else {
            final Map<String, Restaurant> temp = new HashMap<>(restaurants.size());
            for(final Restaurant restaurant : restaurants) {
                temp.put(restaurant.getName(), restaurant);
            }
            this.restaurants = Collections.unmodifiableMap(temp);
        }
    }

    boolean order(final String restaurantName, final RestaurantOrder restaurantOrder) {
        final Restaurant restaurant = this.restaurants.get(restaurantName);
        return restaurant != null && restaurant.order(restaurantOrder);
    }
}
