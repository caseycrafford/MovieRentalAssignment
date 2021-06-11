package za.ac.cput.factory;
import za.ac.cput.entity.NumberOfMoviesRented;
import java.util.UUID;

public class NumberOfMoviesRentedFactory {
    public static NumberOfMoviesRented build(int movieID, int userID, int rentalID, int numMovies){

        if (movieID<0 || userID<0 || rentalID<0 || numMovies<0)
            return null;

        int ID= Integer.parseInt(UUID.randomUUID().toString());

        return new NumberOfMoviesRented.NumberOfMoviesRentedBuilder().
                setMovieID(ID).setUserID(ID).setRentalID(ID).setNumMovies(numMovies).build();
    }
}
