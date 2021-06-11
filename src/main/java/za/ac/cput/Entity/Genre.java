package za.ac.cput.Entity;

/**
 * Author: Emilio Castano
 * Student Number: 219035709
 * Program: Genre Structure of builder pattern
 *
 */
public class Genre {

    private String genreId, genreName, description;

    private Genre(genreBuilder genreBuilder){

        this.genreId = genreBuilder.genreId;
        this.genreName = genreBuilder.genreName;
        this.description = genreBuilder.description;
    }

    public static class genreBuilder{

        private String genreId, genreName, description;

        public genreBuilder setGenreId(String genreId) {
            this.genreId = genreId;
            return this;
        }

        public genreBuilder setGenreName(String genreName) {
            this.genreName = genreName;
            return this;
        }

        public genreBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Genre build(){
            return new Genre(this);
        }
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreId='" + genreId + '\'' +
                ", genreName='" + genreName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
