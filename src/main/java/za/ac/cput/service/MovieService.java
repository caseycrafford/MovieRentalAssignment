package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.Movie;
import za.ac.cput.repository.MovieRepository;
import java.util.Set;
@Deprecated
public class MovieService implements IMovieService{

    private static MovieService service = null;
    private MovieRepository  repo = null;

    private MovieService(){
        this.repo = MovieRepository.getRepository();
    }

    public static MovieService getService(){
        if(service == null){
            service =new MovieService();
        }
        return service;
    }

    @Override
    public Movie create(Movie movie) {
        return this.repo.create(movie);
    }

    @Override
    public Movie read(String userId) {
        return this.repo.read(userId);
    }

    @Override
    public Movie update(Movie movie) {
        return this.repo.update(movie);
    }

    @Override
    public boolean delete(String userId) {
        return this.repo.delete(userId);
    }

    public Set<Movie> getSingleMovie() {
        Set<Movie> singleMovie =null;
        Set<Movie> MovieSet = getAll();

        for (Movie movie : MovieSet)
        {
            if(movie.getMovieId().trim().toUpperCase().contains("A")){
                singleMovie.add(movie);
            }
        }
        return singleMovie;
    }

    @Override
    public Set<Movie> getAll() {
        return this.repo.getAll();
    }

}//end of class
