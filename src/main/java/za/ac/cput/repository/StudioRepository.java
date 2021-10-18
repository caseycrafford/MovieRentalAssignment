package za.ac.cput.repository;

import za.ac.cput.entity.MovieGenre;
import za.ac.cput.entity.Studio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Studio.java
        studio repo
        Author: Marchello Carolus 218234457
        Date: 26 July 2021
        */

public class StudioRepository implements IStudioRepository{

    private static StudioRepository repository = null;
    private List<Studio> studioDB = null;

    private StudioRepository() {
        studioDB = new ArrayList<>();

    }

    public static StudioRepository getRepository(){
        if (repository == null){
            repository = new StudioRepository();
        }
        return repository;
    }

    @Override
    public Studio create(Studio studioId) {
        boolean suc = studioDB.add(studioId);
        if (!suc)
            return null;
        return studioId;

    }

    @Override
    public Studio read(String studio) {
        for (Studio s : studioDB){
            if (s.getStudioId().equals(studio)) {
                return s;
            }
        }
        return null;


    }

    @Override
    public Studio update(Studio studioId) {
        Studio oldStudioID = read(studioId.getStudioId());
        if (oldStudioID != null) {
            studioDB.remove(oldStudioID);
            studioDB.add(studioId);
            return studioId;

        }
        return null;
    }

    @Override
    public boolean delete(String studioId) {
        Studio studioToDelete = read(studioId);
        if (studioToDelete == null)
            return  false;
        studioDB.remove(studioToDelete);
        return true;
    }

    @Override
    public List<Studio> getAll() {
        return studioDB;
    }


}
