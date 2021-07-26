package za.ac.cput.repository;

import za.ac.cput.entity.Genre;

import java.util.Set;

public interface IGenreRepository extends IRepository<Genre, String>{

    public Set<Genre> getAll();

}
