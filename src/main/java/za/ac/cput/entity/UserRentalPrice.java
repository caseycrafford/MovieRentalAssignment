package za.ac.cput.entity;

/*
 * Author: Grant Constant
 * Student number: 216063124
 */

public class UserRentalPrice {
    private int duration;
    private String rentalId;
    private double amount;

    public UserRentalPrice(UserRentalPriceBuilder userRentalPriceBuilder){
        this.rentalId = userRentalPriceBuilder.rentalId;
        this.duration = userRentalPriceBuilder.duration;
        this.amount = userRentalPriceBuilder.amount;
    }

    public static class UserRentalPriceBuilder{
        private int  duration;
        private double amount;
        private String rentalId;

        public UserRentalPriceBuilder setRentalId(String rentalId) {
            this.rentalId = rentalId;
            return this;
        }

        public UserRentalPriceBuilder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public UserRentalPriceBuilder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public UserRentalPrice build(){return new UserRentalPrice(this);}
    }

    @Override
    public String toString() {
        return "UserRentalPrice{" +
                "rentalId=" + rentalId +
                ", duration=" + duration +
                ", amount=" + amount +
                '}';
    }
}
