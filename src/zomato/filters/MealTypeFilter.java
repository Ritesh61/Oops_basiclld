package zomato.filters;

import zomato.api.data.FoodItem;
import zomato.api.data.MealType;
import zomato.api.data.Restaurant;

public class MealTypeFilter implements IFoodItemFilter, IRestaurantFilter {

    private final MealType mealType;

    public MealTypeFilter(MealType mealType) {
        this.mealType = mealType;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getMealType() == this.mealType;
    }

    @Override
    public boolean filter(Restaurant restaurantName) {
        return restaurantName.getMealType() == this.mealType;
    }
}
