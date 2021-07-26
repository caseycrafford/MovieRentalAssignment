package za.ac.cput.repository;

import za.ac.cput.entity.MovieGenre;

import java.util.Set;

public interface IMovieGenreRepository extends IRepository<MovieGenre, String> {
    public Set<MovieGenre> getAll();


}
