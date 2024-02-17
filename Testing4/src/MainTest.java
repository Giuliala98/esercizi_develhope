import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testStampaAnno(){
        OffsetDateTime data = Main.parseDate("2023-03-01T13:00:00Z");
        String anno= Main.getAnno(data);
        String expectedAnno = String.valueOf(data.getYear());
        assertEquals(expectedAnno, anno);
    }

    @Test
    void testStampaMese(){
        OffsetDateTime data = Main.parseDate("2023-03-01T13:00:00Z");
        String mese= Main.getMese(data);
        String expectedMese = String.valueOf(data.getMonth());
        assertEquals(expectedMese, mese);
    }
    @Test
    void testStampaGiorno(){
        OffsetDateTime data = Main.parseDate("2023-03-01T13:00:00Z");
        String giorno= Main.getGiorno(data);
        String expectedGiorno = String.valueOf(data.getDayOfMonth());
        assertEquals(expectedGiorno, giorno);
    }
    @Test
    void testStampaGiornoDellaSettimana(){
        OffsetDateTime data = Main.parseDate("2023-03-01T13:00:00Z");
        String giornoDellaSettimana= Main.getGiornoDellaSettimana(data);
        String expectedGiornoDellaSettimana = String.valueOf(data.getDayOfWeek());
        assertEquals(expectedGiornoDellaSettimana, giornoDellaSettimana);
    }
}