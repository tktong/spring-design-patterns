package me.tktong.restaurant;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RestaurantController {
    private final RestaurantDelegator restaurantDelegator;

    RestaurantController(final RestaurantDelegator restaurantDelegator) {
        this.restaurantDelegator = restaurantDelegator;
    }

    @PostMapping("/restaurant/order")
    public OrderSubmitted submitOrder(@RequestBody final Order order) {
        // Do some request payload validation

        // Convert inbound (request) DTO to framework object
        final RestaurantOrder restaurantOrder = convert(order);

        // Delegate to framework
        final boolean status =  restaurantDelegator.order(order.getName(), restaurantOrder);

        // Convert framework object to outbound (response) DTO
        final OrderSubmitted orderSubmitted = convert(status);

        // Return result to end user
        return orderSubmitted;
    }

    private RestaurantOrder convert(final Order order) {
        final RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.setName(order.getName());
        restaurantOrder.setItems(order.getItems());
        return restaurantOrder;
    }

    private OrderSubmitted convert(final boolean status) {
        final OrderSubmitted orderSubmitted = new OrderSubmitted();
        orderSubmitted.setSuccessful(status);
        return orderSubmitted;
    }
}
