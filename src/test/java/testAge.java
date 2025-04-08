import ie.atu.week12.Patient;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions;

public class testAge
{
    @BeforeEach
    {
        Patient p = new Patient;
    }

    @Test
    void createNewAge()
    {
        Patient p = new Patient("Donnellan", "James", 222, 20);
        assertEquals("Donnellan", p.getFamilyName());
        assertEquals("James", p.getName());
        assertEquals(222, p.getHSEnum());
        assertEquals(20, p.getAge());
    }

    @Test
    void invalidAge()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Patient ("Donnellan", "James", 222, 25));
        assertEquals("Error, Age record doesn't match", ex.getMessage());
    }
}
