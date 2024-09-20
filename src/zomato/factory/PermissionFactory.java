package zomato.factory;

import zomato.api.data.FoodItem;
import zomato.api.data.User;
import zomato.perm.AddToCartPermission;
import zomato.perm.DeleteFromCartPermission;
import zomato.perm.IPermission;

public class PermissionFactory {

    private PermissionFactory() {}

    public static IPermission addToCartPermission(User user, FoodItem foodItem) {
        return new AddToCartPermission(user, foodItem);
    }

    public static IPermission deleteFromPermission(User user, FoodItem foodItem) {
        return new DeleteFromCartPermission(user, foodItem);
    }


}
