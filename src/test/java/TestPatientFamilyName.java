import ie.atu.week12.Patient;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions;

public class TestPatientFamilyName
{
        @Test
        void createFamilyName()
        {
                Patient p = new Patient("James");
                assertEquals("James", p.getFamilyName());
        }

        @Test
        void invalidFamilyName()
        {
                Exception ex = assertThrows(IllegalArgumentException.class, () -> new Patient("Bob"));
                assertEquals("Error", ex.getMessage());
        }
}