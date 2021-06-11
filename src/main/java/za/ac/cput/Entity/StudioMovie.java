package za.ac.cput.Entity;

/**
 * Author: Emilio Castano
 * Student Number: 219035709
 * Program: Studio MovieStructure of builder pattern
 *
 */

public class StudioMovie {

    private int studioId, movieId;

    private StudioMovie(studioBuilder studioBuilder){
        this.studioId = studioBuilder.studioId;
        this.movieId = studioBuilder.movieId;
    }

    //inner class, build main class
    public static class studioBuilder{

        private int studioId, movieId;

        public studioBuilder setStudioId(int studioId) {
            this.studioId = studioId;
            return this;
        }

        public studioBuilder setMovieId(int movieId) {
            this.movieId = movieId;
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
