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
        UserRental o = UserRentalFactory.build(32, 23, 203, 24042021, 65, "Lance");
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
