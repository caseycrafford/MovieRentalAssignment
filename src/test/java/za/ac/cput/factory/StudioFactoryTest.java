package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Studio;

/* MovieGenre.java
        Entity for MovieGenre
        Author: Marchello Carolus 218234457
        Date: 11 June 2021
        */

class StudioFactoryTest {

    @Test
    public void createStudio(){
        Studio stu = StudioFactory.createStudio(12333, "Sony");

        System.out.println(stu);
    }


}