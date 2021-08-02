package za.ac.cput.repository;

/*
    RatingRepository.java
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Repository
    26 July 2021
*/

import za.ac.cput.entity.Rating;

import java.util.HashSet;
import java.util.Set;

public class RatingRepository implements IRatingRepository{
    private static RatingRepository repository = null;
    private Set<Rating> ratingDB = null;

    private RatingRepository(){
        ratingDB = new HashSet<Rating>();
    }

    public static RatingRepository getRepository(){
        if(repository == null){
            repository = new RatingRepository();
        }
        return repository;
    }

    @Override
    public Rating create (Rating rating){
        boolean success = ratingDB.add((rating));
        if(!success)
            return null;
        return rating;
    }

    @Override
    public Rating read(String ratingId) {
        for (Rating r : ratingDB){
            if(r.getMovieId().equals(ratingId)){
                return r;
            }
        }
        return null;
    }

    @Override
    public Rating update(Rating rating){
        Rating oldRating=read(rating.getMovieId());
        if(oldRating!=null){
            ratingDB.remove(oldRating);
            ratingDB.add(rating);
            return rating;
        }
        return null;
    }

    @Override
    public boolean delete(String movieId){
        Rating ratingDeleting=read(movieId);
        if(ratingDeleting==null)
            return false;
        ratingDB.remove(ratingDeleting);
        return true;
    }

    public Set<Rating> getAll(){
        return ratingDB;
    }
}
