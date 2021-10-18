package za.ac.cput.service;

import za.ac.cput.entity.Studio;

import java.util.List;
import java.util.Set;

/*

        Author: Marchello Carolus 218234457

        */
@Deprecated
public interface IStudioService extends IService<Studio, String>{
    public List<Studio> getAll();
}
