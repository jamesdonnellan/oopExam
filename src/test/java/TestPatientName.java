import ie.atu.week12.Patient;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions;
public class TestPatientName
{
    Patient p;
    @BeforeEach
    {
         p = new Patient;
    }
        @Test
        void createPatientName()
        {
            Patient p = new Patient("Donnellan", "James");
            assertEquals("James", p.getName());
        }

        @Test
        void invalidPatientName()
        {
            Exception ex = assertThrows(IllegalArgumentException.class, () -> new Patient("Murphy", "Jim"));
            assertEquals("Error, incorrect Name", ex.getMessage());
        }
}
