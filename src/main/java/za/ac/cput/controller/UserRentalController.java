package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.UserRental;
import za.ac.cput.factory.UserRentalFactory;
import za.ac.cput.service.UserRentalService;

@RestController
@RequestMapping("/UserRental")
public class UserRentalController {

    @Autowired
    private UserRentalService userRentalService;

    @PostMapping("/CreateUserRental")
    public UserRental create(UserRental userRental){
        UserRental newUserRental = UserRentalFactory.build(userRental.getUserId(),userRental.getMovieId(),userRental.getRentalDate(),userRental.getReturnDate(),userRental.getRentedBy());
        return userRentalService.create(newUserRental);
    }
}
