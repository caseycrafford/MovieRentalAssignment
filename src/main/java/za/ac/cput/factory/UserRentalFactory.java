package za.ac.cput.factory;

import za.ac.cput.entity.UserRental;
import java.util.UUID;

public class UserRentalFactory {

    public static UserRental build(int rentalId, int userId, int movieId, int rentalDate, int returnDate, String rentedBy){

        if (rentalId<0 || userId<0 || movieId<0 || rentalDate<0 || returnDate<0 || rentedBy.isEmpty()){
            return null;
        }

        int id= Integer.parseInt(UUID.randomUUID().toString());

        return new UserRental.UserRentalBuilder()
                .setRentalId(id).setUserId(userId).setMovieId(movieId).setRentalDate(rentalDate).setReturnDate(returnDate).setRentedBy(rentedBy).build();
    }
}
