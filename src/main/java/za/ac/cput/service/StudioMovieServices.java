package za.ac.cput.service;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.StudioMovie;
import za.ac.cput.repository.StudioMovieRepository;

import java.util.Set;
/**
 * Author: Emilio Castano
 * Student Number: 219035709
 *
 */
@Service
public class StudioMovieServices implements IStudioMovieService{

    private static StudioMovieServices service = null;
    private StudioMovieRepository repository = null;

    private StudioMovieServices(){
        this.repository = StudioMovieRepository.getRepository();}

    public static StudioMovieServices getService(){
        if(service == null){
            service = new StudioMovieServices();
        }
        return service;
    }

    @Override
    public StudioMovie create(StudioMovie studioMovie){
        return this.repository.create(studioMovie);
    }

    @Override
    public StudioMovie read(String studioMovieId){
        return this.repository.read(studioMovieId);
    }

    @Override
    public StudioMovie update(StudioMovie studioMovie){
        return this.repository.update(studioMovie);
    }

    @Override
    public boolean delete(String studioMovieId){
        return this.repository.delete(studioMovieId);
    }

    public Set<StudioMovie> getSingleStudioMovie() {
        Set<StudioMovie> singleStudioMovie =null;
        Set<StudioMovie> StudioMovieSet = getAll();

        for (StudioMovie studioMovie : StudioMovieSet)
        {
            if(studioMovie.getStudioId().trim().toUpperCase().contains("3")){
                singleStudioMovie.add(studioMovie);
            }
        }
        return singleStudioMovie;
    }

    @Override
    public Set<StudioMovie> getAll(){
        return this.repository.getAll();
    }
}
