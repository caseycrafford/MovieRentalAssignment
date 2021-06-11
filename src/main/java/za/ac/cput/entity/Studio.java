package za.ac.cput.entity;

/* Studio.java
        Entity for studio
        Author: Marchello Carolus 218234457
        Date: 11 June 2021
        */

public class Studio {

    private int studioId;
    private String studioName;


    private Studio(Studio.Builder builder) {
        this.studioId = builder.studioId;
        this.studioName = builder.studioName;

    }

    public static class Builder{

        private int studioId;
        private String studioName;

        public Studio.Builder setStudioId(int studioId) {
            this.studioId = studioId;

            return this;
        }
        public Studio.Builder setStudioName(String studioName) {
            this.studioName = studioName;

            return this;
        }

        public Studio build(){

            return new Studio(this);
        }

        private Studio.Builder copy(Studio studio){

            this.studioId = studio.studioId;
            this.studioName = studio.studioName;

            return this;

        }

    }
    @Override
    public String toString() {
        return "Builder{" +
                "Studio ID ='" + studioId + '\'' +
                ", Studio Name ='" + studioName + '\'' +

                '}';
    }



}
