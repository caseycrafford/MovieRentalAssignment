package za.ac.cput.entity;
/**
 * Author: Lance Kruger
 * Student Number: 218159501
 * Program: Number of movies rented of builder pattern
 *
 */

public class NumberOfMoviesRented {
    private String userID;
    private int rentalID;
    private int movieID;
    private int numMovies;

    private NumberOfMoviesRented(NumberOfMoviesRented.NumberOfMoviesRentedBuilder NumberOfMoviesRentedBuilder) {
        this.userID = NumberOfMoviesRentedBuilder.userID;
        this.rentalID = NumberOfMoviesRentedBuilder.rentalID;
        this.movieID = NumberOfMoviesRentedBuilder.movieID;
        this.numMovies = NumberOfMoviesRentedBuilder.numMovies;


    }

    public String getUserID() {
        return userID;
    }

    public int getRentalID() {
        return rentalID;
    }

    public int getMovieID() {
        return movieID;
    }

    public int getNumMovies() {
        return numMovies;
    }



    public static class NumberOfMoviesRentedBuilder {
        private int rentalID, movieID, numMovies;
        private String userID;


        public NumberOfMoviesRented.NumberOfMoviesRentedBuilder setUserID(String userID) {
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

        public NumberOfMoviesRentedBuilder copy(NumberOfMoviesRented NumberOfMoviesRented)
        {
            this.userID = NumberOfMoviesRented.userID;
            this.rentalID = NumberOfMoviesRented.rentalID;
            this.movieID = NumberOfMoviesRented.movieID;
            this.numMovies = NumberOfMoviesRented.numMovies;

            return this;
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
