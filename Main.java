import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    }

    public Integer ottieniAnno(OffsetDateTime data) {
        Integer anno = data.getYear();
        return anno;
    }

    public String ottieniMese(OffsetDateTime data) {
        String mese = data.getMonth().toString();
        return mese;
    }

    public Integer ottieniGiorno(OffsetDateTime data) {
        Integer giorno = data.getDayOfMonth();
        return giorno;
    }

    public String ottieniGiornoDellaSettimana(OffsetDateTime data) {
        String giornoDellaSettimana = data.getDayOfWeek().toString();
        return giornoDellaSettimana;
    }
}
