public class InstanceofExample {
    public static void main(String[] args) {
        // Примеры объектов
        Object obj = "Hello, world!"; // Объект типа String
        String str = "Java";
        Integer num = 42;

        // Проверка с использованием instanceof
        System.out.println("obj является String: " + (obj instanceof String)); // true
        System.out.println("str является Object: " + (str instanceof Object)); // true
        System.out.println("num является Number: " + (num instanceof Number)); // true
        System.out.println("num является String: " + (num instanceof String)); // false

        // Проверка null-объекта
        Object nullObj = null;
        System.out.println("nullObj instanceof String: " + (nullObj instanceof String)); // false
    }
}
