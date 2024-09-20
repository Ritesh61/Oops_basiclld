package zomato.filters;

import zomato.api.data.FoodItem;

public interface IFoodItemFilter {

    boolean filter(FoodItem foodItem);
}
