package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.StudioMovie;
import za.ac.cput.factory.StudioMovieFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudioMovieServicesTest {
    private static StudioMovieServices service = StudioMovieServices.getService();
    private static StudioMovie studioMovie = StudioMovieFactory.build("24", "34567");

    @Test
    void a_create() {
        StudioMovie created = service.create(studioMovie);
        assertEquals(studioMovie.getStudioId(),created.getStudioId());
        System.out.println("Created" + created);
    }

    @Test
    void b_read() {
        StudioMovie read = service.read(studioMovie.getStudioId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        StudioMovie updated = new StudioMovie.studioBuilder().copy(studioMovie).setStudioId("26").build();
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete() {
        service.delete(studioMovie.getMovieId());
        System.out.println("Deleted: " + studioMovie.getStudioId() + "");
    }

    @Test
    void e_getAll() {
        System.out.println("Show All:");
        System.out.println(service.getAll());
    }
}