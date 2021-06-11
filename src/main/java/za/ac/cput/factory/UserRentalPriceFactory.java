package za.ac.cput.factory;

/*
 * Author: Grant Constant
 * Student number: 216063124
 */

import za.ac.cput.entity.UserRentalPrice;
import java.util.UUID;

public class UserRentalPriceFactory {

    public static UserRentalPrice build(int rentalId, int duration, int amount){
        if (rentalId<0 || duration<0 || amount<0){
            return null;
        }

        int id= Integer.parseInt(UUID.randomUUID().toString());

        return new UserRentalPrice.UserRentalPriceBuilder()
                .setRentalId(rentalId).setDuration(duration).setAmount(amount).build();
    }
}
