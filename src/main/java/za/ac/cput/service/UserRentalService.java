package za.ac.cput.service;

/*
 * Author: Grant Constant
 * Student number: 216063124
 */

import org.springframework.stereotype.Service;
import za.ac.cput.entity.UserRental;
import za.ac.cput.repository.UserRentalRepository;
import java.util.Set;

@Service
public class UserRentalService implements IUserRentalService {

    public static UserRentalService service = null;
    private UserRentalRepository userRentalDB = null;

    private UserRentalService() {
        this.userRentalDB = UserRentalRepository.getRepository();
    }

    static UserRentalService getService(){
        if (service == null) {
            service = new UserRentalService();
        }
        return service;
    }

    @Override
    public UserRental create(UserRental userRental) {
        return this.userRentalDB.create(userRental);
    }

    @Override
    public UserRental read(String rentalId) {
        return this.userRentalDB.read(rentalId);
    }

    @Override
    public UserRental update(UserRental userRental) {
        return this.userRentalDB.update(userRental);
    }

    @Override
    public boolean delete(String userRentalId) {
        return this.userRentalDB.delete(userRentalId);
    }

    @Override
    public Set<UserRental> getAll() {
       return this.userRentalDB.getAll();
    }
}
