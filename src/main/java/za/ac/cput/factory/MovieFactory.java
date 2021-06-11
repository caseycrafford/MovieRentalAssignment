package za.ac.cput.factory;

/*
    MovieFactory.java
    Factory class for the Movie entity
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Entity and Factory
    11 June 2021
*/

import za.ac.cput.entity.Movie;
import java.util.UUID;

public class MovieFactory {

    public static Movie build(String title, String releaseDate, int genreId, int directorId){

        if (title.isEmpty() || releaseDate.isEmpty() || genreId<0 || directorId<0)
            return null;

        String id= UUID.randomUUID().toString();

        return new Movie.MovieBuilder().
                setMovieId(id).setTitle(title).setReleaseDate(releaseDate).
                setGenreId(genreId).setDirectorId(directorId).build();
    }
}
