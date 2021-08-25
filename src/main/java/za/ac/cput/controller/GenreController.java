package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Genre;
import za.ac.cput.factory.GenreFactory;
import za.ac.cput.service.GenreService;

import java.util.Set;

/**
 * Author: Emilio Castano
 * Student Number: 219035709
 *
 */
@RestController
@RequestMapping("/genre")

public class GenreController {
    @Autowired
    private GenreService genreService;

    //@RequestMapping(value = "/create", method = RequestMethod.POST)//only need one to declaire post method
    @PostMapping("/create")
    public Genre create(@RequestBody Genre genre){
        Genre newGenre = GenreFactory.createGenre(genre.getDescription()); //checkout
        return genreService.create(newGenre);
    }

    @GetMapping("/read/{id}")
    public Genre read(@PathVariable String id){
        return genreService.read(id);
    }

    @PostMapping("/update")
    public Genre update(@RequestBody Genre genre){
        return genreService.update(genre);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return genreService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Genre> getAll(){
        return genreService.getAll();
    }


}
