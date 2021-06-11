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

    }

    public static class UserRentalBuilder{
        private int rentalId, userId, movieId, rentalDate, returnDate;
        private String rentedBy;

        public void setRentalId(int rentalId) {
            this.rentalId = rentalId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public void setRentalDate(int rentalDate) {
            this.rentalDate = rentalDate;
        }

        public void setReturnDate(int returnDate) {
            this.returnDate = returnDate;
        }

        public void setRentedBy(String rentedBy) {
            this.rentedBy = rentedBy;
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
