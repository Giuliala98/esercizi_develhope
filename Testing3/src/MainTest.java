import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testStampaFormato(){
        OffsetDateTime data = Main.parseDate("2023-03-01T13:00:00Z");
        String formatData = Main.formattaData(data);
        String exspectedFormatData = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        assertEquals(exspectedFormatData, formatData);

    }
}