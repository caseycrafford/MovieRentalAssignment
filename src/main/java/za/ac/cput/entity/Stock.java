/*
    Stock.java
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Entity and Factory
    11 June 2021
*/

package za.ac.cput.entity;

public class Stock {

    private int movieId;
    private int quantity;

    private Stock(StockBuilder StockBuilder) {
        this.movieId=StockBuilder.movieId;
        this.quantity=StockBuilder.quantity;
    }

    public static class StockBuilder {
        private int movieId;
        private int quantity;

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public Stock build(){
            return new Stock(this);
        }
    }

    @Override
    public String toString() {
        return "Stock{" +
                "movieId=" + movieId +
                ", quantity=" + quantity +
                '}';
    }
}
