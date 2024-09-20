package zomato.api;

import zomato.api.data.CuisineType;
import zomato.api.data.FoodItem;
import zomato.api.data.MealType;
import zomato.api.data.StarRating;
import zomato.filters.CuisineTypeFilter;
import zomato.filters.IFoodItemFilter;
import zomato.filters.MealTypeFilter;
import zomato.filters.StarRatingFilter;

import java.util.ArrayList;
import java.util.List;

public class FoodItemSearcher {



    public List<FoodItem> searchFoodItems(String foodItemName, MealType mealType,
                                          List<CuisineType> cuisineTypeList, StarRating starRating) {
       List<IFoodItemFilter> foodItemFilters = new ArrayList<>();
       if(mealType != null)
           foodItemFilters.add(new MealTypeFilter(mealType));
       if(cuisineTypeList != null)
           foodItemFilters.add(new CuisineTypeFilter(cuisineTypeList));
       if(starRating != null)
           foodItemFilters.add(new StarRatingFilter(starRating));
       return null;
       //return new zomato.searchers.FoodItemSearcher().search(foodItemName, foodItemFilters);
    }
}
