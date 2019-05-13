import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUNIT TEST for FileInput
 *  * @author Hailey Kotvis
 *  * @version 2.0
 */
public class FileInputTest {
    @Test
    void write() throws IOException {
        FileInput fi = new FileInput();
        String characters[] = new String[]{"!", "@", "#", "%", "^", "&", "*", "~", "+", "=", "{", "}", "[", "]"};
        try {
            List<String> allLines = Files.readAllLines(Paths.get(fi.file));
            for (String line : allLines) {
                for (int i = 0; i < characters.length; i++){
                    if(line.contains(characters[i])){
                        assertTrue(fi.file.contains(characters[i]), "No special characters can be in the file");
                    }
                    else{
                        assertFalse(fi.file.contains(characters[i]), "Test Results: PASS");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
