package zomato.filters;

import zomato.api.data.FoodItem;
import zomato.api.data.Restaurant;
import zomato.api.data.StarRating;

public class StarRatingFilter implements IFoodItemFilter, IRestaurantFilter {
    private final StarRating starRating;

    public StarRatingFilter(StarRating starRating) {
        this.starRating = starRating;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getStarRating().getVal() >= this.starRating.getVal();
    }

    @Override
    public boolean filter(Restaurant restaurantName) {
        return restaurantName.getStarRating().getVal() >= this.starRating.getVal();
    }
}
