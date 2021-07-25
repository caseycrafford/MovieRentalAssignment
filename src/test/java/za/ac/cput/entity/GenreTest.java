package za.ac.cput.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.factory.GenreFactory;

import static org.junit.jupiter.api.Assertions.*;

class GenreTest {
    Genre genre1, genre2, genre3, genre4;

    @BeforeEach
    void setUp(){
        genre1 = GenreFactory.build("324312","Adventure", "Enjoy adventures movie, with action and fiction");
        genre2 = GenreFactory.build("63256","Action", "Action pact movies with guns and crazy stunts");
        genre3 = GenreFactory.build("47977", "Horror","These horrors will give you sleepless nights and and scream like never before");
        genre4 = genre2;
    }

    @Test
    void testObjectEquality(){ assertEquals(genre2, genre4);}

    @Test
    void testObjectIdentity(){assertSame(genre2, genre4);}

    @Timeout(20)
    @Test
    void usingTimeout(){assertNotNull(genre2);}

    @Disabled
    @Test
    void  disabledTest(){assertSame(genre1, genre3);}

    }

