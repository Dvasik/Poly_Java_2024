import java.util.Date;

public class FormatExample {
    public static void main(String[] args) {
        // Используем спецификаторы формата для различных типов данных
        boolean boolValue = true;
        char charValue = 'A';
        int intValue = 123;
        double doubleValue = 456.789;
        Date currentDate = new Date();

        // Пример использования спецификатора %b для логического значения
        System.out.printf("Boolean value: %b%n", boolValue);  // Output: Boolean value: true

        // Пример использования спецификатора %c для символа
        System.out.printf("Character value: %c%n", charValue);  // Output: Character value: A

        // Пример использования спецификатора %d для десятичного целого числа
        System.out.printf("Integer value: %d%n", intValue);  // Output: Integer value: 123

        // Пример использования спецификатора %f для числа с плавающей точкой
        System.out.printf("Double value: %f%n", doubleValue);  // Output: Double value: 456.789000

        // Пример использования спецификатора %t для времени и даты
        System.out.printf("Current date and time: %tF%n", currentDate);  // Output: Current date and time: 2024-11-30
    }
}
