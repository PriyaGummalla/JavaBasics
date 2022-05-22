package Test2.UnitTestLab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Unittest9 {

    @Test
    public void testListSize() {
        List list =  new ArrayList();

        assertTrue(list.size() == 0);
    }

    @Test
    public void testNotNull() {
        List list = new ArrayList();
        assertNotNull(list);
    }

}
