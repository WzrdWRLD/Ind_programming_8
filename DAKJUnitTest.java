
import static javafxapplication.FXMLDocumentController.completing;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class DAKJUnitTest {

    @Test
    public void test1FXML() throws Exception {
        assertTrue(completing(2, 3, 4) == 16.00);
        assertTrue(completing(1, 2, 3) == 30.00);
        //assertTrue(completing(1, 2, 5) == 2.31);
    }

    @Test
    public void test2FXML() throws Exception {
        try {
            assertTrue(completing(5, -5, 5) == 0);
            fail("Нет ошибки при делении на 0");
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
    }
}