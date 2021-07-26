package za.ac.cput.entity;

/**
 * Author: Emilio Castano
 * Student Number: 219035709
 * Program: Studio MovieStructure of builder pattern
 *
 */

public class StudioMovie {

    private String studioId, movieId;

    public String getStudioId() {
        return studioId;
    }

    public String getMovieId() {
        return movieId;
    }

    private StudioMovie(studioBuilder studioBuilder){

        this.studioId = studioBuilder.studioId;
        this.movieId = studioBuilder.movieId;
    }

    //inner class, build main class
    public static class studioBuilder{

        private String studioId, movieId;

        public studioBuilder setStudioId(String studioId) {
            this.studioId = studioId;
            return this;
        }

        public studioBuilder setMovieId(String movieId) {
            this.movieId = movieId;
            return this;
        }
        public String getStudioId() {
            return studioId;
        }

        public String getMovieId() {
            return movieId;
        }

        public studioBuilder copy(StudioMovie studioMovie){
            this.studioId = studioMovie.studioId;
            this.movieId = studioMovie.movieId;
            return this;
        }

        public StudioMovie build(){
            return new StudioMovie(this);
        }
    }

    @Override
    public String toString() {
        return "StudioMovie{" +
                "studioId=" + studioId +
                ", movieId=" + movieId +
                '}';
    }
}
