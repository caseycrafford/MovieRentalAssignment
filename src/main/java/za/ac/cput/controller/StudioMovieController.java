package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.StudioMovie;
import za.ac.cput.factory.StudioMovieFactory;
import za.ac.cput.service.StudioMovieServices;

import java.util.Set;

@RestController
@RequestMapping("/studioMovie")

public class StudioMovieController {
    @Autowired
    private StudioMovieServices studioMovieServices;

    @PostMapping("/create")
    public StudioMovie create(@RequestBody StudioMovie studioMovie){
        StudioMovie newStudioMovie = StudioMovieFactory.createstudiomovie(studioMovie.getStudioId()); //checkout possibly add "Builder"
        return studioMovieServices.create(newStudioMovie);
    }

    @GetMapping("/read/{id}")
    public StudioMovie read(@PathVariable String id){
        return studioMovieServices.read(id);
    }

    @PostMapping("/update")
    public StudioMovie update(@RequestBody StudioMovie studioMovie){
        return studioMovieServices.update(studioMovie);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return studioMovieServices.delete(id);
    }

    @GetMapping("/getall")
    public Set<StudioMovie> getAll(){
        return studioMovieServices.getAll();
    }

}
