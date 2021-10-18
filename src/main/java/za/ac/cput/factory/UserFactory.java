package za.ac.cput.factory;

import za.ac.cput.entity.User;
import java.util.UUID;
/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */

public class UserFactory {

    public static User build(String userId , int addressId , int idNumber,String firstName , String lastName)
    {
        if (firstName.isEmpty() || lastName.isEmpty() || userId.isEmpty() || addressId <= 0 || idNumber <=0  )
            return null;

        String userID = UUID.randomUUID().toString();

        return new User.userBuilder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserId(userID)
                .setAddressId(addressId)
                .setIdNumber(idNumber).build();
    }
}
