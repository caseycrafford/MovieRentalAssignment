package za.ac.cput.repository;
/**
 * Author: Emilio Castano
 * Student Number: 219035709
 *
 */

import za.ac.cput.entity.StudioMovie;

import java.util.Set;
@Deprecated
public interface IStudioMovieRepository extends IRepository<StudioMovie, String> {

    public Set<StudioMovie> getAll();
}
