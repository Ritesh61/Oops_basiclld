package zomato.searchers;

import libmngsys.dataaccessor.DBAccess;
import zomato.api.data.Restaurant;
import zomato.filters.IRestaurantFilter;

import java.util.ArrayList;
import java.util.List;

public class RestaurantSearcher {

//    public List<Restaurant> search(String restaurant, List<IRestaurantFilter> filters) {
//        if(restaurant == null || restaurant.isEmpty() || filters == null)
//            throw new IllegalArgumentException("Missing params");
//        DataAccessResult  dataAccessResult = DBAccess.getRestaurantNames(restaurant);
//        List<Restaurant> restaurantNames = DataAccessOjectConverter.convertToRestaurantNames(dataAccessResult);
//        for(IRestaurantFilter filter: filters){
//            List<Restaurant> filteredRestaurantNames = new ArrayList<>();
//            for(Restaurant restaurantName: restaurantNames) {
//                if(filter.filter(restaurantName))
//                    filteredRestaurantNames.add(restaurantName);
//            }
//            restaurantNames = filteredRestaurantNames;
//        }
//        return restaurantNames;
//    }

    public Restaurant searchById(int id) {
        return null;
    }
}
