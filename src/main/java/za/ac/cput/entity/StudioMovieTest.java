package za.ac.cput.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.factory.GenreFactory;
import za.ac.cput.factory.StudioMovieFactory;

import static org.junit.jupiter.api.Assertions.*;

class StudioMovieTest {

    StudioMovie studioMovie1, studioMovie2, studioMovie3;

    @BeforeEach
    void setUp()
    {
        studioMovie1 = StudioMovieFactory.build();
        studioMovie2 = StudioMovieFactory.build();
        studioMovie2 = studioMovie3;

    }


    @Test void testEquality()
    {

    }

    @Test void testIdentity()
    {
        assertSame(studioMovie2, studioMovie3);

    }

    @Disabled
    void disabledTest()
    {
        assertSame();

    }

    @Timeout(15)
    @Test
    void timeoutTest()
    {
        assertNotNull(studioMovie3);

    }

}