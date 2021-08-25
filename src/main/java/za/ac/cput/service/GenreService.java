package za.ac.cput.service;
/**
 * Author: Emilio Castano
 * Student Number: 219035709
 *
 */
import za.ac.cput.entity.Genre;
import za.ac.cput.repository.GenreRepository;

import java.util.Set;

public class GenreService implements IGenreService{
    private static GenreService service = null;
    private GenreRepository repository;

    private GenreService(){
        this.repository = GenreRepository.getRepository();
    }

    public static GenreService getService(){
        if(service == null){
            service = new GenreService();
        }
        return service;
    }
    @Override
    public Genre create(Genre genre){
        return this.repository.create(genre);
    }

    @Override
    public Genre read(String genreId){
        return this.repository.read(genreId);
    }

    @Override
    public Genre update(Genre genre){
        return this.repository.update(genre);
    }

    @Override
    public boolean delete(String genreId){
        return this.repository.delete(genreId);
    }

    @Override
    public Set<Genre> getAll(){
        return this.repository.getAll();
    }

}
