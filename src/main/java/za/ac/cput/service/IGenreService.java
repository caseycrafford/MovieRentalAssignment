package za.ac.cput.service;

import za.ac.cput.entity.Genre;

import java.util.Set;

public interface IGenreService extends IService<Genre, String>{
    public Set<Genre>getAll();
}
