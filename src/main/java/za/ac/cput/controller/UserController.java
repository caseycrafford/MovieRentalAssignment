package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.User;
import za.ac.cput.factory.UserFactory;
import za.ac.cput.service.UserService;

import java.util.Set;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping( value = "/create", method = RequestMethod.POST)
    public User create ( @RequestBody User user) {

        User newUser = UserFactory.build("Yaasin","Cole","123",456,485);

        return userService.create(newUser);

    }

    @GetMapping("/read")
    public User read(@RequestBody User user) {

        return userService.read(user.getUserId());
    }

   /* @PostMapping("/update")
    public User update(){

    }*/
    @GetMapping("/getall")
    public Set<User> getAll() {

        return userService.getAll();
    }
}
