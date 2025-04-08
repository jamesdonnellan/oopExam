import ie.atu.week12.Patient;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions;
public class TestHSE
{
    @BeforeEach
    {
        Patient p = new Patient;
    }

    @Test
    void createNewHSE()
    {
        Patient p = new Patient("Donnellan", "James", 222);
        assertEquals("Donnellan", p.getFamilyName());
        assertEquals("James", p.getName());
        assertEquals(222, p.getHSEnum());
    }

    @Test
    void InvalidHSEnum()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Patient ("McIlroy", "Billy", 123));
        assertEquals("Error, invalid HSE num", ex.getMessage());
    }
}
