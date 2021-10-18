/*
package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.Stock;
import za.ac.cput.repository.StockRepository;
import java.util.Set;
@Deprecated
@Service
public class StockService implements IStockService{

    private static StockService service = null;
    private StockRepository  repo = null;

    private StockService(){
        this.repo = StockRepository.getRepository();
    }

    public static StockService getService(){
        if(service == null){
            service =new StockService();
        }
        return service;
    }

    @Override
    public Stock create(Stock stock) {
        return this.repo.create(stock);
    }

    @Override
    public Stock read(String userId) {
        return this.repo.read(userId);
    }

    @Override
    public Stock update(Stock stock) {
        return this.repo.update(stock);
    }

    @Override
    public boolean delete(String userId) {
        return this.repo.delete(userId);
    }

    public Set<Stock> getSingleStock() {
        Set<Stock> singleStock =null;
        Set<Stock> StockSet = getAll();

        for (Stock stock : StockSet)
        {
            if(stock.getMovieId().trim().toUpperCase().contains("A")){
                singleStock.add(stock);
            }
        }
        return singleStock;
    }

    @Override
    public Set<Stock> getAll() {
        return this.repo.getAll();
    }

}//end of class*/
