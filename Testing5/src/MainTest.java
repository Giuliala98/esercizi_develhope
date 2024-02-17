import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testModificaData(){
        OffsetDateTime data = Main.parseDate("2023-03-01T13:00:00Z");
        OffsetDateTime modificaData = Main.modificaData(data, 1, -1, 7);
        String dataFormattata = Main.dataFormattataPerItalia(modificaData);
        String expectedData = modificaData.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ITALY));

        assertEquals(expectedData, dataFormattata);

    }

}