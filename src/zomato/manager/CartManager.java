package zomato.manager;

import zomato.api.data.CartItem;
import zomato.api.data.DataAccessor;
import zomato.api.data.FoodItem;
import zomato.api.data.User;
import zomato.factory.PermissionFactory;
import zomato.perm.IPermission;

import java.util.List;

public class CartManager {

    public List<CartItem> getUserCart(User user) {
        return null;
    }

    public void addItemToCart(User user, FoodItem foodItem) {
        IPermission permission = PermissionFactory.addToCartPermission(user, foodItem);
        if(!permission.isPermitted()) {
            throw new RuntimeException("Permission denied");
        }
        if(!isFoodItemFromSameRestaurant(user, foodItem))
        {
            throw new RuntimeException("Your cart contains items from different restaurants");
        }
        DataAccessor.addItemToCart(user, foodItem);
    }

    public void deleteItemFromCart(User user, FoodItem foodItem) {

    }

    public void checkoutUserCart(User user) {

    }

    private boolean isFoodItemFromSameRestaurant(User user, FoodItem foodItem) {
        List<CartItem> cartItemList = getUserCart(user);
        return cartItemList.isEmpty() || cartItemList.get(0).getFoodItem().getRestaurantId() == foodItem.getRestaurantId();
    }
}

