package za.ac.cput.service;

/*
 * Author: Grant Constant
 * Student number: 216063124
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.UserRental;
import za.ac.cput.factory.UserRentalFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class UserRentalServiceTest {
    private static UserRentalService service = UserRentalService.getService();
    private static UserRental userRental = UserRentalFactory.build(19, 32, "12 April 2019", "20 April 2019", "Emilio");

    @Test
    void a_create() {
        UserRental created = service.create(userRental);
        assertEquals(created.toString(), userRental.toString());
        System.out.println(("Create: " + created));
    }

    @Test
    void b_read() {
        UserRental read = service.read(userRental.toString());
        assertEquals(read.toString(), userRental.toString());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        UserRental updated = new UserRental.UserRentalBuilder().copy(userRental).setUserId(19).build();
        assertNotNull(service.update(updated));
        System.out.println("Update: " + updated);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All:");
        System.out.println(service.getAll());
    }
}