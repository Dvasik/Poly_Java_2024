public class BooleanCreationExample {
    public static void main(String[] args) {
        // 1. Использование конструктора
        boolean primitiveValue = true;
        Boolean booleanObject1 = new Boolean(primitiveValue);  // создание через конструктор
        System.out.println("Создание через конструктор: " + booleanObject1);  // true

        // 2. Использование метода valueOf(boolean)
        Boolean booleanObject2 = Boolean.valueOf(primitiveValue);  // создание через valueOf
        System.out.println("Создание через valueOf(boolean): " + booleanObject2);  // true

        // 3. Использование метода valueOf(String)
        String trueString = "true";
        String falseString = "false";
        Boolean booleanObject3 = Boolean.valueOf(trueString);   // создание через valueOf(String)
        Boolean booleanObject4 = Boolean.valueOf(falseString);  // создание через valueOf(String)
        System.out.println("Создание через valueOf(String): " + booleanObject3);  // true
        System.out.println("Создание через valueOf(String): " + booleanObject4);  // false

        // 4. Использование предопределенных значений Boolean.TRUE и Boolean.FALSE
        Boolean booleanObject5 = Boolean.TRUE;  // создание через Boolean.TRUE
        Boolean booleanObject6 = Boolean.FALSE; // создание через Boolean.FALSE
        System.out.println("Создание через Boolean.TRUE: " + booleanObject5);  // true
        System.out.println("Создание через Boolean.FALSE: " + booleanObject6); // false

        // 5. Использование предопределенных значений true, false типа boolean
        Boolean booleanObject7 = true;
        Boolean booleanObject8 = false;
        System.out.println("Создание через автобиоксинг: " + booleanObject7);  // true
        System.out.println("Создание через автобиоксинг: " + booleanObject8);  // false
    }
}
