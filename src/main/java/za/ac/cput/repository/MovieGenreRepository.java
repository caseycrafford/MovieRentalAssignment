package za.ac.cput.repository;

import za.ac.cput.entity.MovieGenre;

import java.util.HashSet;
import java.util.Set;

public class MovieGenreRepository implements IMovieGenreRepository{

    private static MovieGenreRepository repo = null;
    private Set<MovieGenre> movieGenreDB = null;

    private MovieGenreRepository() {
        movieGenreDB = new HashSet<MovieGenre>();
    }

    public static MovieGenreRepository getRepository(){
        if (repo == null){
            repo = new MovieGenreRepository();
        }
        return repo;
    }

    @Override
    public MovieGenre create(MovieGenre movieGen) {
        boolean suc = movieGenreDB.add(movieGen);
        if (!suc)
            return null;
        return movieGen;

    }

    @Override
    public MovieGenre read(String genreId) {
        for (MovieGenre m : movieGenreDB)
            if (m.getGenreId().equals(genreId)) {
                return m;
            }
        return null;


    }

    @Override
    public MovieGenre update(MovieGenre genre) {
        MovieGenre oldGenre = read(genre.getGenreId());
        if (oldGenre != null) {
            movieGenreDB.remove(oldGenre);
            movieGenreDB.add(genre);
            return genre;

        }
         return null;
    }

    @Override
    public boolean delete(String genreId) {
        MovieGenre genreToDelete = read(genreId);
        if (genreToDelete == null)
            return  false;
        movieGenreDB.remove(genreToDelete);
        return true;
    }


    @Override
    public Set<MovieGenre> getAll() {
        return movieGenreDB;
    }
}
