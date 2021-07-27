package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.MovieGenre;
import za.ac.cput.factory.MovieGenreFactory;

import static org.junit.jupiter.api.Assertions.*;

/* Studio.java
        studio repo
        Author: Marchello Carolus 218234457
        Date: 26 July 2021
        */

class MovieGenreRepositoryTest {

    private static MovieGenreRepository repo = MovieGenreRepository.getRepository();
    private static MovieGenre genre = MovieGenreFactory.build("2342", "00000");

    @Test
    void create() {
        MovieGenre create = repo.create(genre);
        assertEquals(create.getGenreId(), create.getGenreId());
        System.out.println(create);
    }

    @Test
    void read() {
        MovieGenre read = repo.read(genre.getGenreId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        MovieGenre update = new MovieGenre.Builder().copy(genre).setGenreId("2342").build();
    }

    @Test
    void delete() {
        boolean succ = repo.delete(genre.getGenreId());
        assertTrue(succ);
        System.out.println(succ);
    }

    @Test
    void getAll() {
        System.out.println(repo.getAll());
    }
}