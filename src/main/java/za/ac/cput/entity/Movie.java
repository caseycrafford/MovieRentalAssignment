package za.ac.cput.entity;

/*
    Movie.java
    Entity for the Movie
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Entity and Factory
    11 June 2021
*/


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Movie implements Serializable {
    @Id private String movieId;
    private String title,releaseDate,genreId,directorId;

    protected Movie(){}

    private Movie(MovieBuilder MovieBuilder){
        this.movieId = MovieBuilder.movieId;
        this.genreId = MovieBuilder.genreId;
        this.directorId = MovieBuilder.directorId;
        this.title = MovieBuilder.title;
        this.releaseDate = MovieBuilder.releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getGenreId() {
        return genreId;
    }

    public String getDirectorId() {
        return directorId;
    }

    public static class MovieBuilder {
        private String title,releaseDate,movieId,genreId,directorId;

        public MovieBuilder setMovieId(String movieId) {
            this.movieId = movieId;
            return this;
        }

        public MovieBuilder setGenreId(String genreId) {
            this.genreId = genreId;
            return this;
        }

        public MovieBuilder setDirectorId(String directorId) {
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

        public MovieBuilder copy(Movie movie){
            this.movieId=movie.movieId;
            this.directorId=movie.directorId;
            this.genreId=movie.genreId;
            this.releaseDate=movie.releaseDate;
            this.title=movie.title;
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
