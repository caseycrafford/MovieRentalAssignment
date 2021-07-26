package za.ac.cput.repository;

import za.ac.cput.entity.Studio;

import java.util.Set;

public interface IStudioRepository extends IRepository<Studio, String> {
    public Set<Studio> getAll();
}
