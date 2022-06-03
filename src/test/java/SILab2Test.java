import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

//    private final SILab2 list = new SILab2();
    public static List<String> array1 = List.of("0", "#", "0", "0", "0", "#", "0", "#", "#");
    public static List<String> result1 = List.of("1", "#", "2", "0", "3", "#", "1", "#", "#");

    public static List<String> array2 = List.of("0", "#", "0", "0", "0", "#", "0");
    public static List<String> array3 = List.of();

    public static List<String> array4 = List.of("0", "#", "#", "#", "0", "#", "0", "#", "0");
    public static List<String> result4 = List.of("2", "#", "#", "#", "4", "#", "2", "#", "2");

    public static List<String> array5 = List.of("0", "#", "#", "0", "#", "0", "#", "0", "0", "#", "0", "0", "#", "0", "#", "0");
    public static List<String> result5 = List.of("2", "#", "#", "1", "#", "4", "#", "1", "3", "#", "3", "0", "#", "3", "#", "1");


    @Test
    void functionEveryStatement() {
        assertEquals(result1, SILab2.function(array1));
        assertEquals(result4, SILab2.function(array4));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(array2));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(array3));
    }

    @Test
    void functionEveryBranch() {
        assertEquals(result1, SILab2.function(array1));
        assertEquals(result4, SILab2.function(array4));
        assertEquals(result5, SILab2.function(array5));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(array2));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(array3));
    }

}
