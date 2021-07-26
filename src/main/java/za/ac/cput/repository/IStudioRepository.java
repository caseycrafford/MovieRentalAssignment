package za.ac.cput.repository;

import za.ac.cput.entity.Studio;

import java.util.Set;

/* Studio.java
        studio repo
        Author: Marchello Carolus 218234457
        Date: 26 July 2021
        */

public interface IStudioRepository extends IRepository<Studio, String> {
    public Set<Studio> getAll();
}
