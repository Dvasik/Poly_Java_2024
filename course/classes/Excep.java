public class ExceptionExamples {

    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int result = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            int invalidAccess = numbers[5]; // Доступ за пределами массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        // 3. IllegalArgumentException
        try {
            printSquareRoot(-4); // Передача некорректного аргумента
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }

        // 4. ClassCastException
        try {
            Object obj = "String object";
            Integer invalidCast = (Integer) obj; // Неправильное приведение типа
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }

        // 5. NullPointerException
        try {
            String nullString = null;
            int length = nullString.length(); // Вызов метода на null-объекте
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }

    // Метод для демонстрации IllegalArgumentException
    public static void printSquareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Error");
        }
        System.out.println(Math.sqrt(number));
    }
}
