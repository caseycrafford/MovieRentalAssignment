package za.ac.cput.Entity;

/* Studio.java
        Entity for studio
        Author: Marchello Carolus 218234457
        Date: 11 June 2021
        */

public class MovieGenre {

    private int genreId, movieId;


    private MovieGenre(Builder builder) {
        this.genreId = builder.genreId;
        this.movieId = builder.movieId;

    }


    public static class Builder{

        private int genreId, movieId;

        public Builder setGenreId(int genreId) {
            this.genreId = genreId;

            return this;
        }
        public Builder setMovieId(int movieId) {
            this.movieId = movieId;

            return this;
        }

        public MovieGenre build(){

            return new MovieGenre(this);
        }

        private Builder copy(MovieGenre movies){

            this.genreId = movies.genreId;
            this.movieId = movies.movieId;

            return this;

        }


    }
    @Override
    public String toString() {
        return "Builder{" +
                "GenreID ='" + genreId + '\'' +
                ", MovieId ='" + movieId + '\'' +

                '}';
    }
}
