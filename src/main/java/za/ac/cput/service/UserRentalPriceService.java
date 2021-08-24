package za.ac.cput.service;

/*
 * Author: Grant Constant
 * Student number: 216063124
 */

import za.ac.cput.entity.UserRentalPrice;

import java.util.HashSet;
import java.util.Set;

public class UserRentalPriceService implements IUserRentalPriceService {
    private static za.ac.cput.service.UserRentalPriceService service = null;
    private Set<UserRentalPrice> userRentalPriceDB = null;

    private UserRentalPriceService() { userRentalPriceDB = new HashSet<>(); }

    public static za.ac.cput.service.UserRentalPriceService getService(){
        if (service == null){
            service = new za.ac.cput.service.UserRentalPriceService();
        }

        return service;

    }

    @Override
    public UserRentalPrice create(UserRentalPrice userRentalPrice) {
        boolean success = userRentalPriceDB.add(userRentalPrice);
        if (!success)
            return null;
        return userRentalPrice;
    }

    @Override
    public UserRentalPrice read(String rentalId) {
        for (UserRentalPrice r : userRentalPriceDB)
            if (r.toString().equals(rentalId)) {
                return r;
            }
        return null;
    }

    @Override
    public UserRentalPrice update(UserRentalPrice userRentalPrice) {
        UserRentalPrice oldUserRentalPrice = read(userRentalPrice.toString());
        if (oldUserRentalPrice != null) {
            userRentalPriceDB.remove(oldUserRentalPrice);
            userRentalPriceDB.add(userRentalPrice);
            return userRentalPrice;
        }
        return null;
    }

    @Override
    public boolean delete(String userRentalPriceId) {
        UserRentalPrice userRentalPriceToDelete = read(userRentalPriceId);
        if (userRentalPriceToDelete == null)
            return false;
        userRentalPriceDB.remove(userRentalPriceToDelete);
        return true;
    }

    @Override
    public Set<UserRentalPrice> getAll() {
        return userRentalPriceDB;
    }
}