package za.ac.cput.service;

/*
 * Author: Grant Constant
 * Student number: 216063124
 */

import za.ac.cput.entity.UserRentalPrice;
import za.ac.cput.repository.UserRentalPriceRepository;
import java.util.Set;

public class UserRentalPriceService implements IUserRentalPriceService {
    private static za.ac.cput.service.UserRentalPriceService service = null;
    private UserRentalPriceRepository userRentalPriceDB = null;

    private UserRentalPriceService() {
        this.userRentalPriceDB = UserRentalPriceRepository.getRepository();
    }

    public static za.ac.cput.service.UserRentalPriceService getService(){
        if (service == null){
            service = new za.ac.cput.service.UserRentalPriceService();
        }

        return service;

    }

    @Override
    public UserRentalPrice create(UserRentalPrice userRentalPrice) {
        return this.userRentalPriceDB.create(userRentalPrice);
    }

    @Override
    public UserRentalPrice read(String rentalId) {
        return this.userRentalPriceDB.read(rentalId);
    }

    @Override
    public UserRentalPrice update(UserRentalPrice userRentalPrice) {
        return this.userRentalPriceDB.update(userRentalPrice);
    }

    @Override
    public boolean delete(String userRentalPriceId) {
        return this.userRentalPriceDB.delete(userRentalPriceId);
    }

    @Override
    public Set<UserRentalPrice> getAll() {
        return this.userRentalPriceDB.getAll();
    }
}