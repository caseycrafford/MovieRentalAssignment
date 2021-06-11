package za.ac.cput.Entity;

public class Price {
    private int amount;

    private Price(PriceBuilder PriceBuilder){
        this.amount=PriceBuilder.amount;
    }

    public static class PriceBuilder{
        private int amount;

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public Price build(){
            return new Price(this);
        }
    }

    @Override
    public String toString() {
        return "Price{" +
                "amount=" + amount +
                '}';
    }
}
