package za.ac.cput.Entity;

public class Movie {

    private int movieId,genreId,directorId;
    private String title,releaseDate;

    private Movie(MovieBuilder movieBuilder){
        this.movieId = movieBuilder.movieId;
        this.genreId = movieBuilder.genreId;
        this.directorId = movieBuilder.directorId;
        this.title = movieBuilder.title;
        this.releaseDate = movieBuilder.releaseDate;
    }

    public static class MovieBuilder {
        private int movieId,genreId,directorId;
        private String title,releaseDate;

        public MovieBuilder setMovieId(int movieId) {
            this.movieId = movieId;
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
