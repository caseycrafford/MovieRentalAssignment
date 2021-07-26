package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.MovieGenre;
import za.ac.cput.entity.Studio;
import za.ac.cput.factory.MovieGenreFactory;
import za.ac.cput.factory.StudioFactory;

import static org.junit.jupiter.api.Assertions.*;

class StudioRepositoryTest {

    private static StudioRepository repository = StudioRepository.getRepository();
    private static Studio studio = StudioFactory.build("1234", "Sony");

    @Test
    void create() {
        Studio create = repository.create(studio);
        assertEquals(create.getStudioId(), create.getStudioName());
        System.out.println(create);
    }

    @Test
    void read() {
        Studio read = repository.read(studio.getStudioId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
        Studio update = new Studio.Builder().copy(studio).setStudioId("2342").build();
    }

    @Test
    void delete() {
        boolean success = repository.delete(studio.getStudioId());
        assertTrue(success);
        System.out.println(success);
    }

    @Test
    void getAll() {
        System.out.println(repository.getAll());
    }
}