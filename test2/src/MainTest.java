import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testFormattaFull() {
        OffsetDateTime dateTime = Main.parseDate("2002-03-01T13:00:00Z");
        String formattaData = Main.formatoFull(dateTime);
        String expectedFormattaData = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        assertEquals(expectedFormattaData, formattaData);
    }

    @Test
    void testFormattaMedium() {
        OffsetDateTime dateTime = Main.parseDate("2002-03-01T13:00:00Z");
        String formattaData = Main.formatoMedium(dateTime);
        String expervtedFormattaData = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        assertEquals(expervtedFormattaData, formattaData);
    }

    @Test
    void testFormattaShort() {
        OffsetDateTime dateTime = Main.parseDate("2002-03-01T13:00:00Z");
        String formattaData = Main.formatoShort(dateTime);
        String expervtedFormattaData = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        assertEquals(expervtedFormattaData, formattaData);
    }
}