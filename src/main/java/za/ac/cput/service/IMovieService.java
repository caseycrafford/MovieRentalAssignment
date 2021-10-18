package za.ac.cput.service;
import za.ac.cput.entity.Movie;

import java.util.Set;

@Deprecated
public interface IMovieService extends IService<Movie,String>{
    Set<Movie> getAll();
}
