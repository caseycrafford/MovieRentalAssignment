package za.ac.cput.factory;

import za.ac.cput.entity.UserContact;

import java.util.UUID;

/* UserContactFactory.java
 entity for the UserContactFactory
 Author: Malcolm Camelo (217137334)
 Date: 10 June 2021
*/

public class UserContactFactory {

    public static UserContact build(String Contact) {



        int userId = UUID.randomUUID().hashCode();
        int contactTypeId = UUID.randomUUID().hashCode();


        return new UserContact.userContactBuilder()
                .setUserId(userId)
                .setContactTypeId(contactTypeId)
                .setContact(Contact)
                .build();
    }

}
