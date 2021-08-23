package za.ac.cput.service;

/*
 * Author: Grant Constant
 * Student number: 216063124
 */

import za.ac.cput.entity.UserRental;

import java.util.Set;

public class UserRentalService implements IUserRentalService {

    public static UserRentalService service = null;
    private Set<UserRental> userRentalDB = null;

    @Override
    public UserRental create(UserRental userRental) {
        boolean success = userRentalDB.add(userRental);
        if (!success)
            return null;
        return userRental;
    }

    @Override
    public UserRental read(String rentalId) {
        for (UserRental r : userRentalDB)
            if (r.toString().equals(rentalId)){
                return r;
            }
        return null;
    }

    @Override
    public UserRental update(UserRental userRental) {
        UserRental oldUserRental = read(userRental.toString());
        if (oldUserRental != null) {
            userRentalDB.remove(oldUserRental);
            userRentalDB.add(userRental);
            return userRental;
        }
        return null;
    }

    @Override
    public boolean delete(String userRentalId) {
        UserRental userRentalToDelete = read(userRentalId);
        if (userRentalToDelete == null)
            return false;
        userRentalDB.remove(userRentalToDelete);
        return true;
    }

    @Override
    public Set<UserRental> getAll() {
        return userRentalDB;
    }
}
