package zomato.searchers;

import libmngsys.dataaccessor.DBAccess;
import zomato.api.data.FoodItem;
import zomato.filters.IFoodItemFilter;

import java.util.ArrayList;
import java.util.List;

public class FoodItemSearcher {

//    public List<FoodItem> search(String foodItemName, List<IFoodItemFilter> filters) {
//        if(foodItemName == null || foodItemName.isEmpty() || filters == null)
//            throw new IllegalArgumentException("Missing params");
//        DataAccessResult  dataAccessResult = DBAccess.getFoodItemsWithName(foodItemName);
//        List<FoodItem> foodItems = DataAccessOjectConverter.convertToFoodItems(dataAccessResult);
//        for(IFoodItemFilter filter: filters){
//            List<FoodItem> filteredFoodItems = new ArrayList<>();
//            for(FoodItem foodItem: foodItems) {
//                if(filter.filter(foodItem))
//                    filteredFoodItems.add(foodItem);
//            }
//            foodItems = filteredFoodItems;
//        }
//        return foodItems;
//    }

    public FoodItem searchById(int id) {
        return null;
    }
}
