package zomato.perm;

import zomato.api.data.User;

public class UpdateOrderPermission implements IPermission{

//    private final User user;
//    private final Order order;
//    private final OrderStatus orderStatus;
    @Override
    public boolean isPermitted() {
        return false;
    }
}
