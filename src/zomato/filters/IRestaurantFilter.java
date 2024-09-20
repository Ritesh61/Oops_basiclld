package zomato.filters;

import zomato.api.data.Restaurant;

public interface IRestaurantFilter {


    boolean filter(Restaurant restaurantName);
}
