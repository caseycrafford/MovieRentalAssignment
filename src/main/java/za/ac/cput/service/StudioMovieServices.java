package za.ac.cput.service;


import za.ac.cput.entity.StudioMovie;
import za.ac.cput.repository.StudioMovieRepository;

import java.util.Set;

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

    @Override
    public Set<StudioMovie> getAll(){
        return this.repository.getAll();
    }
}
