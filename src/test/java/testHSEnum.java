import ie.atu.week12.Patient;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions;

public class testHSEnum
{
    Patient p;
    @BeforeEach
    {
        p = new Patient;
    }
    @Test
    void createPatientName()
    {
        Patient p = new Patient(123);
        assertEquals("James", p.getName());
    }

    @Test
    void invalidFamilyName()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Patient("Bob"));
        assertEquals("Error", ex.getMessage());
    }
}
