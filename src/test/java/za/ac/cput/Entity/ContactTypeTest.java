package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.ContactType;
import za.ac.cput.factory.ContactTypeFactory;
/* ContactTypeTest.java
Test for the ContactType
 Author: Malcolm Camelo (217137334)
 Date: 10 June 2021
*/

class ContactTypeTest {
    @Test
    void test()
    {
        ContactType uc = ContactTypeFactory.build("","",84385385);
        System.out.println(uc);


    }
}