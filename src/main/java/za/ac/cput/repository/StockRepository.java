package za.ac.cput.repository;

/*
    StockRepository.java
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Repository
    26 July 2021
*/

import za.ac.cput.entity.Stock;

import java.util.HashSet;
import java.util.Set;

public class StockRepository implements IStockRepository{
    private static StockRepository repository = null;
    private Set<Stock> stockDB = null;

    private StockRepository(){
        stockDB = new HashSet<Stock>();
    }

    public static StockRepository getRepository(){
        if(repository == null){
            repository = new StockRepository();
        }
        return repository;
    }

    @Override
    public Stock create (Stock stock){
        boolean success = stockDB.add((stock));
        if(!success)
            return null;
        return stock;
    }

    @Override
    public Stock read(String movieId) {
        for (Stock s : stockDB){
            if(s.getMovieId().equals(movieId)){
                return s;
            }
        }
        return null;
    }

    @Override
    public Stock update(Stock stock){
        Stock oldStock=read(stock.getMovieId());
        if(oldStock!=null){
            stockDB.remove(oldStock);
            stockDB.add(stock);
            return stock;
        }
        return null;
    }

    @Override
    public boolean delete(String movieId){
        Stock stockDeleting=read(movieId);
        if(stockDeleting==null)
            return false;
        stockDB.remove(stockDeleting);
        return true;
    }

    public Set<Stock> getAll(){
        return stockDB;
    }
}

