package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.MovieGenre;
import za.ac.cput.factory.MovieGenreFactory;
import za.ac.cput.repository.MovieGenreRepository;

import static org.junit.jupiter.api.Assertions.*;


// Author: Marchello Carolus 218234457

class MovieGenreServiceTest {

    private static MovieGenreService serveice = MovieGenreService.getService();
    private static MovieGenre genre = MovieGenreFactory.build("2342", "00000");

    @Test
    void create() {
        MovieGenre create = serveice.create(genre);
        assertEquals(create.getGenreId(), create.getGenreId());
        System.out.println(create);
    }

    @Test
    void read() {
        MovieGenre read = serveice.read(genre.getGenreId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        MovieGenre update = new MovieGenre.Builder().copy(genre).setGenreId("2342").build();
    }

    @Test
    void delete() {
        boolean succ = serveice.delete(genre.getGenreId());
        assertTrue(succ);
        System.out.println(succ);
    }

    @Test
    void getAll() {
        System.out.println(serveice.getAll());
    }
}