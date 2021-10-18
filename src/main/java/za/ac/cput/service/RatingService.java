package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.Rating;
import za.ac.cput.repository.RatingRepository;
import java.util.Set;

@Service
public class RatingService implements IRatingService{

    private static RatingService service = null;
    private RatingRepository  repo = null;

    private RatingService(){
        this.repo = RatingRepository.getRepository();
    }

    public static RatingService getService(){
        if(service == null){
            service =new RatingService();
        }
        return service;
    }

    @Override
    public Rating create(Rating Rating) {
        return this.repo.create(Rating);
    }

    @Override
    public Rating read(String userId) {
        return this.repo.read(userId);
    }

    @Override
    public Rating update(Rating Rating) {
        return this.repo.update(Rating);
    }

    @Override
    public boolean delete(String userId) {
        return this.repo.delete(userId);
    }

    public Set<Rating> getSingleRating() {
        Set<Rating> singleRating =null;
        Set<Rating> RatingSet = getAll();

        for (Rating Rating : RatingSet)
        {
            if(Rating.getMovieId().trim().toUpperCase().contains("A")){
                singleRating.add(Rating);
            }
        }
        return singleRating;
    }

    @Override
    public Set<Rating> getAll() {
        return this.repo.getAll();
    }

}//end of class

