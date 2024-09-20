package zomato.api;

import zomato.api.data.*;
import zomato.filters.CuisineTypeFilter;
import zomato.filters.IRestaurantFilter;
import zomato.filters.MealTypeFilter;
import zomato.filters.StarRatingFilter;

import java.util.ArrayList;
import java.util.List;

public class RestaurantSearcher {

    public List<Restaurant> searchRestaurant(String restaurantName, MealType mealType,
                                                    List<CuisineType> cuisineTypeList, StarRating starRating) {
        //to be filled
        List<IRestaurantFilter> filters = new ArrayList<>();
        if(mealType != null)
            filters.add(new MealTypeFilter(mealType));
        if(starRating != null)
            filters.add(new StarRatingFilter(starRating));
       if(cuisineTypeList != null)
           filters.add(new CuisineTypeFilter(cuisineTypeList));

       return null;
       //return new zomato.searchers.RestaurantSearcher().search(restaurantName, filters);

    }
}
