package za.ac.cput.Entity;

public class Rating {
    private int movieId;
    private float rating;

    private Rating(RatingBuilder RatingBuilder){
        this.movieId = RatingBuilder.movieId;
        this.rating = RatingBuilder.rating;
    }

    public static class RatingBuilder {
        private int movieId;
        private float rating;

        public RatingBuilder setMovieId(int movieId) {
            this.movieId = movieId;
            return this;
        }

        public RatingBuilder setRating(float rating) {
            this.rating = rating;
            return this;
        }

        public Rating build(){
            return new Rating(this);
        }
    }

    @Override
    public String toString() {
        return "Rating{" +
                "movieId=" + movieId +
                ", rating=" + rating +
                '}';
    }
}
