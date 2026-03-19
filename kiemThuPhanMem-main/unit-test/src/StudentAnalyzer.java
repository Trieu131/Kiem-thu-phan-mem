import java.util.List;

public class StudentAnalyzer {

    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     */
    public int countExcellentStudents(List<Double> scores) {
        //BIT230459
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;

        // Vòng lặp 1: duyệt danh sách điểm
        for (Double score : scores) {
            if (score >= 0 && score <= 10) { // validate
                if (score >= 8.0) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Tính điểm trung bình hợp lệ (từ 0 đến 10)
     * @param scores danh sách điểm
     * @return điểm trung bình của các điểm hợp lệ
     */
    public double calculateValidAverage(List<Double> scores) {
        //BIT230459
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        double sum = 0;
        int count = 0;

        // Vòng lặp 2: tính trung bình hợp lệ
        for (Double score : scores) {
            if (score >= 0 && score <= 10) {
                sum += score;
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }
}
