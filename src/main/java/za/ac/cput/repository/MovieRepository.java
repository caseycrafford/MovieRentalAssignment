package za.ac.cput.repository;

/*
    MovieRepository.java
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Repository
    26 July 2021
*/

import za.ac.cput.entity.Movie;

import java.util.HashSet;
import java.util.Set;

public class MovieRepository implements IMovieRepository{
    private static MovieRepository repository = null;
    private Set <Movie> movieDB = null;

    private MovieRepository(){
        movieDB = new HashSet<Movie>();
    }

    public static MovieRepository getRepository(){
        if(repository == null){
            repository = new MovieRepository();
        }
        return repository;
    }

    @Override
    public Movie create (Movie movie){
        boolean success = movieDB.add((movie));
        if(!success)
            return null;
        return movie;
    }

    @Override
    public Movie read(String movieId) {
        for (Movie m : movieDB){
            if(m.getMovieId().equals(movieId)){
                return m;
            }
        }
        return null;
    }

    @Override
    public Movie update(Movie movie){
        Movie oldMovie=read(movie.getMovieId());
        if(oldMovie!=null){
            movieDB.remove(oldMovie);
            movieDB.add(movie);
            return movie;
        }
        return null;
    }

    @Override
    public boolean delete(String movieId){
        Movie movieDeleting=read(movieId);
        if(movieDeleting==null)
            return false;
        movieDB.remove(movieDeleting);
        return true;
    }

    public Set<Movie> getAll(){
        return  movieDB;
    }
}
