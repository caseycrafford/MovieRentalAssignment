package za.ac.cput.repository;

/*
 * Author: Grant Constant
 * Student number: 216063124
 */

import za.ac.cput.entity.UserRental;

import java.util.*;

public class UserRentalRepository implements IUserRentalRepository{
    private static UserRentalRepository repository = null;
    private Set<UserRental> userRentalDB = null;

    private UserRentalRepository() {
        userRentalDB = new HashSet<UserRental>();
    }

    public static UserRentalRepository getRepository() {
        if (repository == null) {
            repository = new UserRentalRepository();
        }

        return repository;

    }

    @Override
    public UserRental create(UserRental userRental) {
        boolean success = userRentalDB.add(userRental);
        if (!success)
            return null;
        return userRental;
    }

    @Override
    public UserRental read(String rentalId){
        for (UserRental r : userRentalDB) {
            if (r.toString().equals(rentalId)) {
                return r;
            }
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
