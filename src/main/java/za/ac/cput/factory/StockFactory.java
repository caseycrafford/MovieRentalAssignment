package za.ac.cput.factory;

/*
    StockFactory.java
    Factory class for the Stock entity
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Entity and Factory
    11 June 2021
*/

import za.ac.cput.entity.Stock;

public class StockFactory {

    public static Stock build(String movieId, int quantity){

        if (movieId.isEmpty())
            return null;

        return new Stock.StockBuilder().setMovieId(movieId)
                .setQuantity(quantity).build();
    }
}
