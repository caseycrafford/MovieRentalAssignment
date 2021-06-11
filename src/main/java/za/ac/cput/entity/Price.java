package za.ac.cput.entity;

/*
    Price.java
    Entity for the Price
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Entity and Factory
    11 June 2021
*/

public class Price {
    private int amount;

    private Price(PriceBuilder PriceBuilder){
        this.amount=PriceBuilder.amount;
    }

    public static class PriceBuilder{
        private int amount;

        public PriceBuilder setAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public Price build(){
            return new Price(this);
        }
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Price{" +
                "amount=" + amount +
                '}';
    }
}
