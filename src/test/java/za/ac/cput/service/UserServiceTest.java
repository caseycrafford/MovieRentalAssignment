package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.User;
import za.ac.cput.factory.UserFactory;
import za.ac.cput.repository.UserRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class UserServiceTest {
    private static UserService service = UserService.getService();
    private static User user = UserFactory.build("boy" , "Cole", "7856", 756, 101);

    @Test
    @Order(1)
    void Create()
    {
        User built =service.create(user);

        assertEquals(built.getUserId() , user.getUserId());
        System.out.println("Create :"+ built);

    }
    @Test
    @Order(2)
    void Read()
    {
        User read = service.read(user.getUserId());

        assertNotNull(read);
        System.out.println("Read : " + read);

    }
    @Test
    @Order(3)
    void Update()
    {
        User updated = new User.userBuilder().copy(user).setFirstName("John").setLastName("Snow").setUserId("100").setAddressId(756).setIdNumber(94).build();

        assertNotNull(service.update(updated));
        System.out.println("updated : "+ updated);


    }
    @Test
    @Order(4)
    void Delete()
    {
        boolean success =service.delete(user.getUserId());
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