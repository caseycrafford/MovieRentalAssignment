package za.ac.cput.repository;
/**
 * Author: Emilio Castano
 * Student Number: 219035709
 *
 */
import za.ac.cput.entity.StudioMovie;

import java.util.HashSet;
import java.util.Set;
@Deprecated
public class StudioMovieRepository implements IStudioMovieRepository{
    private static StudioMovieRepository repository = null;
    private Set<StudioMovie> studioMovieDB = null;

    private StudioMovieRepository(){ studioMovieDB = new HashSet<StudioMovie>();}

    public static StudioMovieRepository getRepository(){
        if(repository ==null){
            repository = new StudioMovieRepository();
        }
        return repository;
    }

    @Override
    public StudioMovie create(StudioMovie studioMovie) {
        boolean success = studioMovieDB.add(studioMovie);
        if(!success)
            return null;
        return studioMovie;
    }

    @Override
    public StudioMovie read(String studioId) {
        for(StudioMovie s : studioMovieDB)
            if(s.toString().equals(studioId)){
                return s;
            }
        return null;
    }

    @Override
    public StudioMovie update(StudioMovie studioMovie) {
        StudioMovie oldStudioMovie = read(studioMovie.toString()); //make changes toString should be get
        if(oldStudioMovie != null){
        studioMovieDB.remove(oldStudioMovie);
        studioMovieDB.add(studioMovie);
        return studioMovie;
        }
        return null;
    }

    @Override
    public boolean delete(String studioId) {
        StudioMovie studioMovieToDelete = read(studioId);
        if(studioMovieToDelete == null)
            return false;
        studioMovieDB.remove(studioMovieToDelete);
        return true;
    }

    @Override
    public Set<StudioMovie> getAll() {
        return studioMovieDB;
    }
}
