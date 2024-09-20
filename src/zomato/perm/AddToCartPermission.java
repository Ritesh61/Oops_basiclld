package zomato.perm;

import zomato.api.data.FoodItem;
import zomato.api.data.Restaurant;
import zomato.api.data.User;
import zomato.manager.DeliveryManager;
import zomato.searchers.RestaurantSearcher;

public class AddToCartPermission implements IPermission {

    private final User user;
    private final FoodItem foodItem;
    private final DeliveryManager deliveryManager;

    public AddToCartPermission(User user, FoodItem foodItem) {
        this.user = user;
        this.foodItem = foodItem;
        this.deliveryManager = new DeliveryManager();
    }

    @Override
    public boolean isPermitted() {
        if(!foodItem.isAvailable())
            return false;

        Restaurant restaurant = new RestaurantSearcher().searchById(foodItem.getRestaurantId());
        return deliveryManager.isDeliveryPossible(restaurant.getAddress(), user.getAddress());
    }
}
