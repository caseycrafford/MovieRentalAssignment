package za.ac.cput.service;


import za.ac.cput.entity.Studio;
import za.ac.cput.repository.StudioRepository;
import java.util.Set;

// Author: Marchello Carolus 218234457

public class StudioService {

    private static StudioService service = null;
    private StudioRepository repo = null;

    private StudioService(){
        this.repo = StudioRepository.getRepository();
    }

    public static StudioService getService(){
        if(service == null) {
            service = new StudioService();
        }
        return service;
    }


    public Studio create(Studio studio){
        return this.repo.create(studio);
    }


    public Studio read(String studioId){
        return this.repo.read(studioId);
    }

    public Studio update(Studio studio){
        return this.repo.update(studio);
    }

    public boolean delete(String studioId){
        return this.repo.delete(studioId);
    }

    public Set<Studio> getAll(){
        return this.repo.getAll();
    }
}
