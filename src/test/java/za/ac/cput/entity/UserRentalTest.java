package za.ac.cput.entity;

/*
 * Author: Grant Constant
 * Student number: 216063124
 */

import za.ac.cput.factory.UserRentalFactory;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserRentalTest {

    @Test
    void test ()
    {
        UserRental o = UserRentalFactory.build(23, 203, "10 January 2018", "12 January 2018", "Lance");
        System.out.println(o);
        assertNotNull(o);
    }

    @Test
    void testEqualty()
    {

    }

    @Test
    void testIdentity()
    {

    }

    @Disabled
    void disabledTest()
    {

    }

    @Timeout(10)
    @Test
    void timeoutTest()
    {

    }
}
