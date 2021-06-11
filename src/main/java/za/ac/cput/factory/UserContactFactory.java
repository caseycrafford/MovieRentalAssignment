package za.ac.cput.factory;

import za.ac.cput.entity.UserContact;

/* UserContactFactory.java
 entity for the UserContactFactory
 Author: Malcolm Camelo (217137334)
 Date: 10 June 2021
*/

public class UserContactFactory {

   public static UserContact build(int userId ,int contactTypeId ,String contact)
   {
      if (contact.isEmpty())
         return null;

       //int userId= Integer.parseInt(UUID.randomUUID().toString());


      return new UserContact.userContactBuilder()
        .setUserId(userId)
        .setContactTypeId(contactTypeId)
        .setContact(contact)
        .build();
   }

}
