package za.ac.cput.controller;

/*
 * Author: Grant Constant
 * Student number: 216063124
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.UserRentalPrice;
import za.ac.cput.factory.UserRentalPriceFactory;
import za.ac.cput.service.UserRentalPriceService;

@RestController
@RequestMapping("/UserRentalPrice")
public class UserRentalPriceController {

    @Autowired
    private UserRentalPriceService uRPService;

    @PostMapping("/CreateUserRentalPrice")
    public UserRentalPrice create(UserRentalPrice userRentalPrice){
        UserRentalPrice newURP = UserRentalPriceFactory.build(userRentalPrice.getDuration(), userRentalPrice.getAmount());
        return uRPService.create(newURP);
    }

}
