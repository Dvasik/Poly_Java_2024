// Класс, в котором используется инициализация элементов перечисления
public enum Day {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7);

    private final String name;
    private final int dayNumber;
    
    Day(String name, int dayNumber) {
        this.name = name;
        this.dayNumber = dayNumber;
    }
}
