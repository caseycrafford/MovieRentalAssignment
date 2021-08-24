package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.UserRentalPrice;
import za.ac.cput.factory.UserRentalPriceFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserRentalPriceServiceTest {
    private static UserRentalPriceService service = UserRentalPriceService.getService();
    private static UserRentalPrice userRentalPrice = UserRentalPriceFactory.build(9,20.00);

    @Test
    void create() {
        UserRentalPrice created = service.create(userRentalPrice);
        assertEquals(created.toString(),userRentalPrice.toString());
        System.out.println("Create: " + created);
    }

    @Test
    void read() {
        UserRentalPrice read = service.read(userRentalPrice.toString());
        assertEquals(read.toString(), userRentalPrice.toString());
        System.out.println("Create: " + read);
    }

    @Test
    void update() {
        UserRentalPrice updated = new UserRentalPrice.UserRentalPriceBuilder().copy(userRentalPrice).setDuration(9).build();
        assertNotNull(service.update(updated));
        System.out.println("Update: " + updated);
    }

    @Test
    void getAll() {
        System.out.println("Show All:");
        System.out.println(service.getAll());
    }
}