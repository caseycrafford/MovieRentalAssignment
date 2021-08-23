package za.ac.cput.service;

import za.ac.cput.entity.Price;
import za.ac.cput.repository.PriceRepository;
import java.util.Set;

public class PriceService implements IPriceService{

    private static PriceService service = null;
    private PriceRepository  repo = null;

    private PriceService(){
        this.repo = PriceRepository.getRepository();
    }

    public static PriceService getService(){
        if(service == null){
            service =new PriceService();
        }
        return service;
    }

    @Override
    public Price create(Price price) {
        return this.repo.create(price);
    }

    @Override
    public Price read(String userId) {
        return this.repo.read(userId);
    }

    @Override
    public Price update(Price price) {
        return this.repo.update(price);
    }

    @Override
    public boolean delete(String userId) {
        return this.repo.delete(userId);
    }

    public Set<Price> getSinglePrice() {
        Set<Price> singlePrice =null;
        Set<Price> PriceSet = getAll();

        for (Price price : PriceSet)
        {
            if(price.getMovieId().trim().toUpperCase().contains("A")){
                singlePrice.add(price);
            }
        }
        return singlePrice;
    }

    @Override
    public Set<Price> getAll() {
        return this.repo.getAll();
    }

}//end of class
