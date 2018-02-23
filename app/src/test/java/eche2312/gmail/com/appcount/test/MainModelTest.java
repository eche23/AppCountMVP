package eche2312.gmail.com.appcount.test;

import org.junit.Before;
import org.junit.Test;
import eche2312.gmail.com.appcount.model.MainModel;
import static org.junit.Assert.*;

/**
 * Created by eched on 23/02/2018.
 */
public class MainModelTest {

    private MainModel model;

    @Before
    public void setUp() throws Exception {
        model = new MainModel();
    }

    @Test
    public void testInit() throws Exception {
        assertEquals(0, model.getContador());
    }

    @Test
    public void testIncrementarOne() throws Exception {
        model.incrementar();
        assertEquals(1, model.getContador());
    }

    @Test
    public void testIncrementarTwo() throws Exception {
        model.incrementar();
        model.incrementar();
        assertEquals(2, model.getContador());
    }

    @Test
    public void testDecrementarOne() throws Exception {
        model.decrementar();
        assertEquals(-1, model.getContador());
    }

    @Test
    public void testDecrementarTwo() throws Exception {
        model.decrementar();
        model.decrementar();
        assertEquals(-2, model.getContador());
    }

    @Test
    public void testIncrementarDecrementarOne() throws Exception {
        model.incrementar();
        model.decrementar();
        assertEquals(0, model.getContador());
    }

}