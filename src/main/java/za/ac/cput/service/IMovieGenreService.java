package za.ac.cput.service;

import za.ac.cput.entity.MovieGenre;

import java.util.Set;

/*

        Author: Marchello Carolus 218234457

        */

public interface IMovieGenreService extends IService<MovieGenre, String>{
    public Set<MovieGenre> getAll();
}
