package za.ac.cput.service;
/**
 * Author: Emilio Castano
 * Student Number: 219035709
 *
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Genre;
import za.ac.cput.factory.GenreFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenreServiceTest {
    private static GenreService service = GenreService.getService();
    private static Genre genre = GenreFactory.build("HOR", "Horror", "These horrors will give you sleepless nights and and scream like never before");


    @Test
    void a_create() {
        Genre created = service.create(genre);
        assertEquals(genre.getGenreId(),created.getGenreId());
        System.out.println("Created" + created);
    }

    @Test
    void b_read() {
        Genre read = service.read(genre.getGenreId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Genre updated = new Genre.genreBuilder().copy(genre).setGenreId("HOR").build();
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete() {
        service.delete(genre.getGenreId());
        System.out.println("Deleted: " + genre.getGenreId() + "");
    }

    @Test
    void e_getAll() {
        System.out.println("Show All:");
        System.out.println(service.getAll());
    }
}