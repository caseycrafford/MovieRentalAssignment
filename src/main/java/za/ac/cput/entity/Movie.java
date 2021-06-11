package za.ac.cput.entity;

/*
    Movie.java
    Entity for the Movie
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Entity and Factory
    11 June 2021
*/

public class Movie {

    private int genreId,directorId;
    private String title,releaseDate, movieId;

    private Movie(MovieBuilder MovieBuilder){
        this.movieId = MovieBuilder.movieIdnew;
        this.genreId = MovieBuilder.genreId;
        this.directorId = MovieBuilder.directorId;
        this.title = MovieBuilder.title;
        this.releaseDate = MovieBuilder.releaseDate;
    }

    public static class MovieBuilder {
        private int movieId,genreId,directorId;
        private String title,releaseDate,movieIdnew;

        public MovieBuilder setMovieId(String movieId) {
            this.movieIdnew = movieId;
            return this;
        }

        public MovieBuilder setGenreId(int genreId) {
            this.genreId = genreId;
            return this;
        }

        public MovieBuilder setDirectorId(int directorId) {
            this.directorId = directorId;
            return this;
        }

        public MovieBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieBuilder setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Movie build(){
            return new Movie(this);
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", genreId=" + genreId +
                ", directorId=" + directorId +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
