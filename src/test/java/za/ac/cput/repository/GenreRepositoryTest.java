package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Genre;
import za.ac.cput.factory.GenreFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

public class GenreRepositoryTest {
    private static GenreRepository repository = GenreRepository.getRepository();
    private static Genre genre = GenreFactory.build("23", "Horror", "These horrors will give you sleepless nights and and scream like never before");

    @Test
    void e_getAll() {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }

    @Test
    void a_create() {
        Genre created = repository.create(genre);
        //assertEquals(created.genreId(), genre.toString()); //genreId must change
        assertEquals(created.toString(), genre);
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Genre read = repository.read("23");
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Genre updated = new Genre.genreBuilder().copy(genre).setDescription("24").build(); //copy needs to change
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete("23");
        assertTrue(success);
        System.out.println("Delete: " + success);
    }
}