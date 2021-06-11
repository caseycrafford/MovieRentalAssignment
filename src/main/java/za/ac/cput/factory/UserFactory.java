package za.ac.cput.factory;

import za.ac.cput.entity.User;

import java.util.UUID;
/**
 * Author: Muhammad Yaasin Cole
 * Student Number: 218340869
 *
 */

public class UserFactory {

    private int userId ,addressId , idNumber;
    private String firstName,lastName;

    public static User build(String firstName , String lastName, int userId , int addressId , int idNumber)
    {
        if (firstName.isEmpty()||lastName.isEmpty()|| userId <= 0 || addressId <= 0 || idNumber <=0  )
        {
            return null;
        }

        int userID = Integer.parseInt(UUID.randomUUID().toString());
        int idNUmber = Integer.parseInt(UUID.randomUUID().toString());


        return new User.userBuilder()
                .setFirstName(firstName).setLastName(lastName).setUserId(userID)
                .setAddressId(addressId).setIdNumber(idNUmber).build();
    }
}
