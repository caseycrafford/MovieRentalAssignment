package za.ac.cput.factory;
import za.ac.cput.entity.MovieRentedOut;
import java.util.UUID;

import static javax.swing.text.html.parser.DTDConstants.ID;


public class MoviesRentedOutFactory {
    public static MovieRentedOut build(int movieID, int quantity){

        if (movieID<0 || quantity<0)
            return null;

        String ID= UUID.randomUUID().toString();

        return new MovieRentedOut.MovieRentedOutBuilder().
                setMovieID(ID).setQuantity(quantity).build();
    }
}
