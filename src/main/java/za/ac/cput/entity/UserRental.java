package za.ac.cput.entity;

/*
 * Author: Grant Constant
 * Student number: 216063124
 */

public class UserRental {
    private int rentalId, userId, movieId, rentalDate, returnDate;
    private String rentedBy;

    public UserRental(UserRentalBuilder userRentalBuilder){
        this.rentalId = userRentalBuilder.rentalId;
        this.userId = userRentalBuilder.userId;
        this.movieId = userRentalBuilder.movieId;
        this.rentalDate = userRentalBuilder.rentalDate;
        this.returnDate = userRentalBuilder.returnDate;
        this.rentedBy = userRentalBuilder.rentedBy;

    }

    public static class UserRentalBuilder{
        private int rentalId, userId, movieId, rentalDate, returnDate;
        private String rentedBy;

        public UserRentalBuilder setRentalId(int rentalId) {
            this.rentalId = rentalId;
            return this;
        }

        public UserRentalBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserRentalBuilder setMovieId(int movieId) {
            this.movieId = movieId;
            return this;
        }

        public UserRentalBuilder setRentalDate(int rentalDate) {
            this.rentalDate = rentalDate;
            return this;
        }

        public UserRentalBuilder setReturnDate(int returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public UserRentalBuilder setRentedBy(String rentedBy) {
            this.rentedBy = rentedBy;
            return this;
        }

        public UserRental build(){return new UserRental(this);}
    }

    @Override
    public String toString() {
        return "UserRental{" +
                "rentalId=" + rentalId +
                ", userId=" + userId +
                ", movieId=" + movieId +
                ", rentalDate=" + rentalDate +
                ", returnDate=" + returnDate +
                ", rentedBy='" + rentedBy + '\'' +
                '}';
    }
}
