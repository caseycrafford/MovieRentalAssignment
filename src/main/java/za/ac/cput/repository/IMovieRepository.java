package za.ac.cput.repository;
import za.ac.cput.entity.Movie;
import java.util.Set;

public interface IMovieRepository extends IRepository<Movie, String> {
    public Set <Movie> getAll();
}
