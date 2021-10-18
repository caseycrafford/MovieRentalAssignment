package za.ac.cput.service;

import za.ac.cput.entity.MovieGenre;
import za.ac.cput.repository.MovieGenreRepository;

import java.util.Set;
/*  MovieGenreService.java
    Author: Marchello Carolus 218234457
*/
@Deprecated
public class MovieGenreService {
    private static MovieGenreService service = null;
    private MovieGenreRepository repo = null;

    private MovieGenreService(){
        this.repo = MovieGenreRepository.getRepository();
    }

    public static MovieGenreService getService(){
        if(service == null) {
            service = new MovieGenreService();
        }
        return service;
    }


    public MovieGenre create(MovieGenre movieGenre){
        return this.repo.create(movieGenre);
    }


    public MovieGenre read(String genreId){
        return this.repo.read(genreId);
    }

    public MovieGenre update(MovieGenre genre){
        return this.repo.update(genre);
    }

    public boolean delete(String genreId){
        return this.repo.delete(genreId);
    }

    public Set<MovieGenre> getAll(){
        return this.repo.getAll();
    }


}
