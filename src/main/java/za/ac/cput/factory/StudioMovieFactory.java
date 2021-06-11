package za.ac.cput.factory;

import za.ac.cput.entity.StudioMovie;

import java.util.UUID;

public class StudioMovieFactory {

    public static StudioMovie build( int studioId, int movieId){
        if( studioId< 0 || movieId<0 )
            return null;

        int id = Integer.parseInt(UUID.randomUUID().toString());

        return new StudioMovie.studioBuilder().
                setStudioId(studioId).setMovieId(movieId).build();
    }

}
