/*
    Price.java
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Entity and Factory
    11 June 2021
*/

package za.ac.cput.entity;

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
