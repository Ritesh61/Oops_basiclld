package zomato.api;

import zomato.api.data.FoodItem;
import zomato.api.data.User;
import zomato.manager.CartManager;
import zomato.manager.UserManager;
import zomato.searchers.FoodItemSearcher;

public class AddToCart {

    private final UserManager userManager;
    private final FoodItemSearcher foodItemSearcher = new FoodItemSearcher();
    private final CartManager cartManager = new CartManager();

    public AddToCart(UserManager userManager) {
        this.userManager = userManager;
    }

    public void addToCart(String userToken, int foodItemId) {
        if(userToken == null || userToken.isEmpty() || foodItemId < 0)
        {

        }
        User user = userManager.getUserByToken(userToken);
        if(user == null) {

        }
        FoodItem foodItem = foodItemSearcher.searchById(foodItemId);
        if(foodItem == null) {

        }
        cartManager.addItemToCart(user, foodItem);
    }
}
