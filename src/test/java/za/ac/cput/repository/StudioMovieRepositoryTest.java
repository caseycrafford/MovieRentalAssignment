package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.StudioMovie;
import za.ac.cput.factory.StudioMovieFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

public  class StudioMovieRepositoryTest {
    private static StudioMovieRepository repository = StudioMovieRepository.getRepository();
    private static StudioMovie studioMovie = StudioMovieFactory.build("23", "34567");


    @Test
    void a_create() {
        StudioMovie created = repository.create(studioMovie);
        assertEquals(created.toString(), studioMovie);
        System.out.println("Create: " + created);

    }

    @Test
    void b_read() {
        StudioMovie read = repository.read("30");
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        StudioMovie updated = new StudioMovie.studioBuilder().copy(studioMovie).setMovieId("45678").build(); //setStudioMovie should be copy
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete("30");
        assertTrue(success);
        System.out.println("Delete " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Show All: ");
        System.out.println(repository.getAll());
    }
}