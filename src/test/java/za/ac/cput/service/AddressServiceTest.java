package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Address;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.repository.AddressRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AddressServiceTest {

    private static IAddressService service = AddressService.getService();
    private static Address address = AddressFactory.build("roseMary", "Cape Town", "South Africa"
            ,"Western Cape",7801 , "68597");

    @Test
    @Order(1)
    void Create()
    {
        Address built =service.create(address);

        assertEquals(built.getUserId() , address.getUserId());
        System.out.println("Create :"+ built);

    }
    @Test
    @Order(2)
    void Read()
    {
        Address read = service.read(address.getUserId());

        assertNotNull(read);
        System.out.println("Read : " + read);

    }
    @Test
    @Order(3)
    void Update()
    {
        Address updated = new Address.addressBuilder().copy(address).setCity("Durban").setCountry("Sweden")
                .setPostalCode(1111).setProvince("Random").setuserId("8000")
                .setStreet("denmarkstreet").build();

        assertNotNull(service.update(updated));
        System.out.println("updated : "+ updated);


    }
    @Test
    @Order(4)
    void Delete()
    {
        boolean success =service.delete(address.getUserId());
        assertTrue(success);
        System.out.println("Deleted : "+ success);

    }

    @Test
    @Order(5)
    void getAll()
    {
        System.out.println("Show All : ");
        System.out.println(service.getAll());

    }
}