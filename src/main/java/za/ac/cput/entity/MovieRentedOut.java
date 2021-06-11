package za.ac.cput.entity;

/**
 * Author: Lance Kruger
 * Student Number: 218159501
 * Program: Movies Rented out of builder pattern
 *
 */

public class MovieRentedOut {
    private int movieID;
    private int quantity;

    private MovieRentedOut(MovieRentedOutBuilder MovieRentedOutBuilder) {
        this.movieID = MovieRentedOutBuilder.movieID;
        this.quantity = MovieRentedOutBuilder.quantity;
    }

    public static class MovieRentedOutBuilder {
        private int movieID, quantity;

        public MovieRentedOut.MovieRentedOutBuilder setMovieID(int movieID) {
            this.movieID = movieID;
            return this;
        }

        public MovieRentedOut.MovieRentedOutBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public MovieRentedOut build() {
            return new MovieRentedOut(this);
        }


        @Override
        public String toString() {
            return "MovieRentedOut{" +
                    "movieID=" + movieID +
                    ", quantity=" + quantity +
                    '}';
        }
    }
}
