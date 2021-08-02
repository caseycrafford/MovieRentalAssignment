package za.ac.cput.repository;

import za.ac.cput.entity.MovieGenre;

import java.util.Set;

/* Studio.java
        studio repo
        Author: Marchello Carolus 218234457
        Date: 26 July 2021
        */

public interface IMovieGenreRepository extends IRepository<MovieGenre, String> {
    public Set<MovieGenre> getAll();


}
