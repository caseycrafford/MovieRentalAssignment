package za.ac.cput.repository;

/*
    PriceRepository.java
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Repository
    26 July 2021
*/

import za.ac.cput.entity.Price;

import java.util.HashSet;
import java.util.Set;
@Deprecated
public class PriceRepository implements IPriceRepository{
    private static PriceRepository repository = null;
    private Set<Price> priceDB = null;

    private PriceRepository(){
        priceDB = new HashSet<Price>();
    }

    public static PriceRepository getRepository(){
        if(repository == null){
            repository = new PriceRepository();
        }
        return repository;
    }

    @Override
    public Price create (Price price){
        boolean success = priceDB.add((price));
        if(!success)
            return null;
        return price;
    }

    @Override
    public Price read(String movieId) {
        for (Price s : priceDB){
            if(s.getMovieId().equals(movieId)){
                return s;
            }
        }
        return null;
    }

    @Override
    public Price update(Price price){
        Price oldPrice=read(price.getMovieId());
        if(oldPrice!=null){
            priceDB.remove(oldPrice);
            priceDB.add(price);
            return price;
        }
        return null;
    }

    @Override
    public boolean delete(String movieId){
        Price priceDeleting=read(movieId);
        if(priceDeleting==null)
            return false;
        priceDB.remove(priceDeleting);
        return true;
    }

    public Set<Price> getAll(){
        return priceDB;
    }
}
