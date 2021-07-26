package za.ac.cput.repository;

import za.ac.cput.entity.Rating;

import java.util.Set;

public interface IRatingRepository extends IRepository<Rating, String> {
    public Set<Rating> getAll();
}
