/*
package za.ac.cput.service;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Genre;
import za.ac.cput.repository.GenreRepository;

import java.util.Set;
@Deprecated
public class GenreService implements IGenreService{
    private static GenreService service = null;
    private GenreRepository repository = null;

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

    public Set<Genre> getSingleGenre() {
        Set<Genre> singleGenre =new HashSet<Genre>();
        Set<Genre> GenreSet = getAll();

        for (Genre genre : GenreSet)
        {
            if(genre.getGenreId().trim().toUpperCase().contains("HOR")){
                singleGenre.add(genre);
            }
        }
        return singleGenre;
    }

    @Override
    public Set<Genre> getAll(){
        return this.repository.getAll();
    }

}
*/
