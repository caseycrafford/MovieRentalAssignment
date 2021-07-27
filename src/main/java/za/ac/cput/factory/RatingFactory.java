package za.ac.cput.factory;

/*
    RatingFactory.java
    Factory class for the Rating entity
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Entity and Factory
    11 June 2021
*/

import za.ac.cput.entity.Rating;

public class RatingFactory {
    public static Rating build(String movieId, double rating){

        if (movieId.isEmpty() )
            return null;

        return new Rating.RatingBuilder().
                setMovieId(movieId).setRating(rating)
                .build();
    }
}
