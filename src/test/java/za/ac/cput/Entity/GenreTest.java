package za.ac.cput.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.factory.GenreFactory;

import static org.junit.jupiter.api.Assertions.*;

class GenreTest {
    Genre genre1, genre2, genre3, genre4;

    @BeforeEach void setUp() {

        genre1 = GenreFactory.build(genreId:"12345", genreName:"Action", description:"full of action, suspense" );
        genre2 = GenreFactory.build(genreId:"45679", genreName:"Horror", description:"scary and tense");
        genre3 = GenreFactory.build(genreId:"25632", genreName:"Comedy", description:"fun for family");
        genre4 = genre2;
    }


    @Test void testEquality()
    {
        assertEquals(genre2 , genre4);

    }

    @Test void testIdentity()
    {
        assertSame(genre2, genre3);

    }

    @Disabled
    void disabledTest()
    {
        assertSame(genre1, genre2);

    }

    @Timeout(15)
    @Test
    void timeoutTest()
    {
        assertNotNull(genre3);

    }

}