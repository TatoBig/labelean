package mycompany.classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionsTest {

    @Test
    public void test_category(){
        Functions functions = new Functions();
        assertEquals("Mueble de terraza ",functions.getCategory("Mueble de terraza | Mesas de jardín"));
    }

    @Test
    public void test_product() {
        Functions functions = new Functions();
        assertEquals(" Mesas de jardín",functions.getProduct("Mueble de terraza | Mesas de jardín"));
    }
}