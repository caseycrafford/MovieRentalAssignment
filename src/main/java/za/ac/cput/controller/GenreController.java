package za.ac.cput.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.Genre;

/**
 * Author: Emilio Castano
 * Student Number: 219035709
 *
 */
@RestController
@RequestMapping("/genre")

public class GenreController {

    @RequestMapping(value = "/create", method = RequestMethod.POST)//only need one to declaire post method
    //@PostMapping("/create")

    public String create(Genre genre){
        return "created";
    }
}
