package za.ac.cput.entity;
/**
 * Author: Lance Kruger
 * Student Number: 218159501
 * Program: Number of movies rented of builder pattern
 *
 */

public class NumberOfMoviesRented {
    private int userID;
    private int rentalID;
    private int movieID;
    private int numMovies;

    private NumberOfMoviesRented(NumberOfMoviesRented.NumberOfMoviesRentedBuilder NumberOfMoviesRentedBuilder) {
        this.userID = NumberOfMoviesRentedBuilder.userID;
        this.rentalID = NumberOfMoviesRentedBuilder.rentalID;
        this.movieID = NumberOfMoviesRentedBuilder.movieID;
        this.numMovies = NumberOfMoviesRentedBuilder.numMovies;
    }

    public static class NumberOfMoviesRentedBuilder {
        private int userID, rentalID, movieID, numMovies;

        public NumberOfMoviesRented.NumberOfMoviesRentedBuilder setUserID(int userID) {
            this.userID = userID;
            return this;
        }

        public NumberOfMoviesRented.NumberOfMoviesRentedBuilder setRentalID(int rentalID) {
            this.rentalID = rentalID;
            return this;
        }

        public NumberOfMoviesRented.NumberOfMoviesRentedBuilder setMovieID(int movieID) {
            this.movieID = movieID;
            return this;
        }

        public NumberOfMoviesRented.NumberOfMoviesRentedBuilder setNumMovies(int numMovies) {
            this.numMovies = numMovies;
            return this;
        }

        public NumberOfMoviesRented build() {
            return new NumberOfMoviesRented(this);
        }

        @Override
        public String toString() {
            return "NumberOfMoviesRented{" +
                    "userID=" + userID +
                    ", rentalID=" + rentalID +
                    ", movieID=" + movieID +
                    ", numMovies=" + numMovies +
                    '}';
        }
    }
}
