import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        // Trường hợp bình thường (có hợp lệ & không hợp lệ)
        assertEquals(2,
                analyzer.countExcellentStudents(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
                )
        );

        // Trường hợp danh sách rỗng
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));

        // Trường hợp toàn hợp lệ
        assertEquals(3,
                analyzer.countExcellentStudents(
                        Arrays.asList(8.0, 9.0, 10.0)
                )
        );
    }

    @Test
    public void testCalculateValidAverage() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        // Có điểm không hợp lệ
        assertEquals(8.17,
                analyzer.calculateValidAverage(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
                ),
                0.01
        );

        // Danh sách rỗng
        assertEquals(0,
                analyzer.calculateValidAverage(Collections.emptyList()),
                0.01
        );

        // Chỉ chứa 0 và 10
        assertEquals(5.0,
                analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)),
                0.01
        );
    }
}


