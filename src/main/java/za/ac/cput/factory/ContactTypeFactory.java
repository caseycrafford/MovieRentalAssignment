package za.ac.cput.factory;
import za.ac.cput.entity.ContactType;

/* ContactTypeFactory.java
 entity for the ContactTypeFactory
 Author: Malcolm Camelo (217137334)
 Date: 10 June 2021
*/
public class ContactTypeFactory {

    public static ContactType build(String name , String description , int contactTypeId)
    {
        if (name.isEmpty())
            return null;

        //int userId= Integer.parseInt(UUID.randomUUID().toString());


        return new ContactType.contactTypeBuilder()
                .setName(name)
                .setDescription(description)
                .setContactTypeId(contactTypeId).build();
    }


}
