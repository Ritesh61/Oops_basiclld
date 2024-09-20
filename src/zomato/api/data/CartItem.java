package zomato.api.data;

public class CartItem {

    private final FoodItem foodItem;

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public CartItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }
}
