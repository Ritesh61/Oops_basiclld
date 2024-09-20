package zomato.filters;

import zomato.api.data.CuisineType;
import zomato.api.data.FoodItem;
import zomato.api.data.Restaurant;

import java.util.List;

public class CuisineTypeFilter implements IFoodItemFilter, IRestaurantFilter {
    private final List<CuisineType> cuisineTypeList;

    public CuisineTypeFilter(List<CuisineType> cuisineTypeList) {
        this.cuisineTypeList = cuisineTypeList;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return this.cuisineTypeList.contains(foodItem.getCuisineType());
    }

    @Override
    public boolean filter(Restaurant restaurant) {
        List<CuisineType> cuisineTypes = restaurant.getCuisineTypeList();
        for(CuisineType cuisineType: this.cuisineTypeList)
            if(this.cuisineTypeList.contains(cuisineType))
                return true;

        return false;
    }
}
