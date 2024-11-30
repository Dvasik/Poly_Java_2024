import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
        Date date = new Date();

        // Использование спецификаторов формата даты и времени
        System.out.printf("Час (00–23): %tH%n", date);  // Час в 24-часовом формате
        System.out.printf("Час (1–12): %tI%n", date);  // Час в 12-часовом формате
        System.out.printf("Минуты (00–59): %tM%n", date);  // Минуты
        System.out.printf("Секунды (00–59): %tS%n", date);  // Секунды
        System.out.printf("Полное название месяца: %tB%n", date);  // Полное название месяца
    }
}
