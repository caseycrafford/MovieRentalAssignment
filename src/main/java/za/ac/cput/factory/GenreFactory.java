package za.ac.cput.factory;

import za.ac.cput.entity.Genre;

import java.util.UUID;

public class GenreFactory {

    public static Genre build( String genreId, String genreName, String description){

        if(genreId.isEmpty() || genreName.isEmpty())
            return null;

        int id = Integer.parseInt(UUID.randomUUID().toString());

        return new Genre.genreBuilder()
                .setGenreId(genreId).setGenreName(genreName).setDescription(description).build();


    }

}
