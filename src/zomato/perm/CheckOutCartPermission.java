package zomato.perm;

import zomato.api.data.User;

public class CheckOutCartPermission implements IPermission {

    private final User user;

    public CheckOutCartPermission(User user) {
        this.user = user;
    }

    @Override
    public boolean isPermitted() {
        return false;
    }
}
