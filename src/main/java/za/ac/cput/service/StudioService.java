package za.ac.cput.service;


import org.springframework.stereotype.Service;
import za.ac.cput.entity.Studio;
import za.ac.cput.repository.StudioRepository;

import java.util.List;
import java.util.Set;

// Author: Marchello Carolus 218234457

@Service
public class StudioService implements IStudioService{

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

    public List<Studio> getAll(){
        return this.repo.getAll();
    }
}
