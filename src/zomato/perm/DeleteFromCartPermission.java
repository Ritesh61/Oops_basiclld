package zomato.perm;

import zomato.api.data.FoodItem;
import zomato.api.data.User;

public class DeleteFromCartPermission implements IPermission {

    private final User user;
    private final FoodItem foodItem;

    public DeleteFromCartPermission(User user, FoodItem foodItem) {
        this.user = user;
        this.foodItem = foodItem;
    }

    @Override
    public boolean isPermitted() {
        return false;
    }
}
