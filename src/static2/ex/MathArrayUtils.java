package static2.ex;

public class MathArrayUtils {

    //인스턴스에 생성을 막는다.
    private MathArrayUtils() {
    }
    public static int sum(int[] values) {
        int totalValue = 0;
        for (int value : values) {
            totalValue += value;
        }
        return totalValue;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;

    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
