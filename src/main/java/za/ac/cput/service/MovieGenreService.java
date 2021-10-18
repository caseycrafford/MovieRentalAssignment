//package za.ac.cput.service;
//
//import org.springframework.stereotype.Service;
//import za.ac.cput.entity.MovieGenre;
//import za.ac.cput.repository.MovieGenreRepository;
//
//import java.util.List;
//import java.util.Set;
///*  MovieGenreService.java
//    Author: Marchello Carolus 218234457
//*/
//@Deprecated
//@Service
//public class MovieGenreService implements IMovieGenreService{
//    private static MovieGenreService service = null;
//    private MovieGenreRepository repo = null;
//
//    private MovieGenreService(){
//        this.repo = MovieGenreRepository.getRepository();
//    }
//
//    public static MovieGenreService getService(){
//        if(service == null) {
//            service = new MovieGenreService();
//        }
//        return service;
//    }
//
//    @Override
//    public MovieGenre create(MovieGenre movieGenre){
//        return this.repo.create(movieGenre);
//    }
//
//    @Override
//    public MovieGenre read(String genreId){
//        return this.repo.read(genreId);
//    }
//
//    @Override
//    public MovieGenre update(MovieGenre genre){
//        return this.repo.update(genre);
//    }
//
//    @Override
//    public boolean delete(String genreId){
//        return this.repo.delete(genreId);
//    }
//
//    @Override
//    public List<MovieGenre> getAll(){
//        return this.repo.getAll();
//    }
//
//
//}
