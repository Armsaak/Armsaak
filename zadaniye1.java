public class AverageChecker {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};   // Пример массива
        double expectedAverage = 2.5; // Предполагаемое среднее значение

        boolean result = isAverageEqual(array, expectedAverage);
        
        System.out.println("Среднее значение массива " + (result ? "равно" : "не равно") + " переданному значению.");
    }

    public static boolean isAverageEqual(int[] array, double expectedAverage) {
        if (array == null || array.length == 0) {
            return false; // Если массив пустой или null, возвращаем false
        }

        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        double actualAverage = (double) sum / array.length;
        return Math.abs(actualAverage - expectedAverage) < 1e-9; // Учитываем погрешность вычислений с плавающей точкой
    }
} 


// Среднее значение массива равно переданному значению.