import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer anno = data.getYear();
        System.out.println("Anno:" + anno);
        String mese = data.getMonth().toString();
        System.out.println("Mese: " + mese);
        Integer giorno = data.getDayOfMonth();
        System.out.println("Giorno: " + giorno);
        String giornoDellaSettimana = data.getDayOfWeek().toString();
        System.out.println("Giorno della settimana: " + giornoDellaSettimana);
    }
}
