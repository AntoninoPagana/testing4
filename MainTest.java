import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void controlloAnno() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer actual = data.getYear();
        Integer expected = 2023;
        assertEquals(expected, actual);
    }

    @Test
    void controlloMese() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String actual = data.getMonth().toString();
        String expected = "MARCH";
        assertEquals(expected, actual);
    }

    @Test
    void controlloGiorno() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer actual = data.getDayOfMonth();
        Integer expected = 01;
        assertEquals(expected, actual);
    }

    @Test
    void controlloGiornoDellaSettimana() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String actual = data.getDayOfWeek().toString();
        String expected = "WEDNESDAY";
        assertEquals(expected, actual);
    }
}