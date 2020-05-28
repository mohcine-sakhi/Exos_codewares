import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpinWordsTest {

    @Test
    void spinWords() {
        assertEquals("enichoM est un emmoh tres xuegaruoc", SpinWords.spinWords("Mohcine est un homme tres courageux"));
    }

    @Test
    void reverse() {
        assertEquals("enichoM", SpinWords.reverse("Mohcine"));
    }
}