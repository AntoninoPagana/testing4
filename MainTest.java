import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    Main testing = new Main();

    @Test
    void controlloAnno() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer result = testing.ottieniAnno(data);
        assertEquals(2023, result);
    }

    @Test
    void controlloMese() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = testing.ottieniMese(data);
        assertEquals("MARCH", result);
    }

    @Test
    void controlloGiorno() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer result = testing.ottieniGiorno(data);
        assertEquals(01, result);
    }

    @Test
    void controlloGiornoDellaSettimana() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = testing.ottieniGiornoDellaSettimana(data);
        assertEquals("WEDNESDAY", result);
    }
}