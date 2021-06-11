package za.ac.cput.Entity;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.UserContact;
import za.ac.cput.factory.UserContactFactory;
/* UserContactTest.java
 Test for the UserContact
 Author: Malcolm Camelo (217137334)
 Date: 10 June 2021
*/

class UserContactTest {


    @Test
    void test()
    {
        UserContact uc =UserContactFactory.build(165216712,34934,"021782567");
        System.out.println(uc);


    }


}