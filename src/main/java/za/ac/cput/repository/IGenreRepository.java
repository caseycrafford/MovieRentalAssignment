package za.ac.cput.repository;
/**
 * Author: Emilio Castano
 * Student Number: 219035709
 *
 */

import za.ac.cput.entity.Genre;

import java.util.Set;

public interface IGenreRepository extends IRepository<Genre, String>{

    public Set<Genre> getAll();

}
