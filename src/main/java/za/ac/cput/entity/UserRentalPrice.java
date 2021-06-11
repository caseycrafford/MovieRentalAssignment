package za.ac.cput.entity;

public class UserRentalPrice {
    private int rentalId, duration, amount;

    private UserRentalPrice(UserRentalPriceBuilder userRentalPriceBuilder){
        this.rentalId = userRentalPriceBuilder.rentalId;
        this.duration = userRentalPriceBuilder.duration;
        this.amount = userRentalPriceBuilder.amount;
    }

    private static class UserRentalPriceBuilder{
        private int rentalId, duration, amount;

        public void setRentalId(int rentalId) {
            this.rentalId = rentalId;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public void setAmount(int amount) {
            this.amount = amount;
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
