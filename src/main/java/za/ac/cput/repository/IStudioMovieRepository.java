package za.ac.cput.repository;

import za.ac.cput.entity.StudioMovie;

import java.util.Set;

public interface IStudioMovieRepository extends IRepository<StudioMovie, String> {

    public Set<StudioMovie> getAll();
}
