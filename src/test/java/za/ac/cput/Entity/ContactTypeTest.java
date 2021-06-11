package za.ac.cput.Entity;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.entity.ContactType;
import za.ac.cput.factory.ContactTypeFactory;


import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
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
    @Test
    void test2Equal() {
        ContactType uc = ContactTypeFactory.build("b","c",84385385);
        ContactType uc2 = ContactTypeFactory.build("a","e",84385385);
        assertNotEquals(uc, uc2);
    }
    @Test
    void test3Identity()
    {
        ContactType uc = ContactTypeFactory.build("b","c",84385385);
        assertSame(uc,uc);
    }
    @Timeout(value = 1, unit = MILLISECONDS)
    void test4TimeOut()
    {
        for (int i =0;i<100;i++)
        {
            ContactType uc = ContactTypeFactory.build("b","c",84385385);
            System.out.println(uc);
        }
    }

    @Disabled
    void test5Disable()
    {
        int v =2;
        int i=1;
        assertSame(i,v);
    }


}