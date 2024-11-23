public class OperatorPractice {
    public static void main(String[] args) {
        // Операторы присваивания (=, +=, -=, *=, /=, %=)
        int a = 10; // =
        a += 5; // a = 15
        a -= 3; // a = 12
        a *= 2; // a = 24
        a /= 4; // a = 6
        a %= 5; // a = 1
        System.out.println("Результат присваивания: " + a);

        String str = "Hello";
        str += " World!"; // Конкатенация строк
        System.out.println("String после +=: " + str);

        // Тернарный оператор (?:)
        int x = 10, y = 20;
        int max = (x > y) ? x : y; // max = 20
        System.out.println("Максимум: " + max);

        // Логические операторы (||, &&)
        boolean b1 = true, b2 = false;
        System.out.println("Логическое ИЛИ: " + (b1 || b2)); // true
        System.out.println("Логическое И: " + (b1 && b2)); // false

        // Побитовые операторы (|, ^, &)
        int bit1 = 5;  // 0101
        int bit2 = 3;  // 0011
        System.out.println("Побитовое ИЛИ: " + (bit1 | bit2)); // 0111 (7)
        System.out.println("Побитовое XOR: " + (bit1 ^ bit2)); // 0110 (6)
        System.out.println("Побитовое И: " + (bit1 & bit2)); // 0001 (1)

        // Операторы сравнения (==, >, >=, <, <=)
        System.out.println("Равно: " + (x == y)); // false
        System.out.println("Больше: " + (x > y)); // false
        System.out.println("Меньше или равно: " + (x <= y)); // true

        // Сдвиги (>>, >>>, <<)
        int shift = 8; // 1000
        System.out.println("Сдвиг вправо: " + (shift >> 1)); // 0100 (4)
        System.out.println("Беззнаковый сдвиг вправо: " + (shift >>> 1)); // 0100 (4)
        System.out.println("Сдвиг влево: " + (shift << 1)); // 10000 (16)

        // Арифметические операторы (+, -, *, /, %)
        int num1 = 15, num2 = 4;
        System.out.println("Сложение: " + (num1 + num2)); // 19
        System.out.println("Вычитание: " + (num1 - num2)); // 11
        System.out.println("Умножение: " + (num1 * num2)); // 60
        System.out.println("Деление: " + (num1 / num2)); // 3
        System.out.println("Остаток от деления: " + (num1 % num2)); // 3

        // Унарные операторы (++, --, ~, !)
        int unary = 10;
        System.out.println("Префиксный инкремент: " + (++unary)); // 11
        System.out.println("Постфиксный инкремент: " + (unary++)); // 11, потом 12
        System.out.println("Постфиксный декремент: " + (unary--)); // 12, потом 11
        System.out.println("Префиксный декремент: " + (--unary)); // 10

        int bitwise = 5; // 0101
        System.out.println("Инверсия битов: " + (~bitwise)); // 1010 (-6)

        boolean bool = true;
        System.out.println("Логическое НЕ: " + (!bool)); // false

        // Группировка (()), обращение к массиву ([]), методы
        int[] arr = {1, 2, 3};
        System.out.println("Первый элемент массива: " + arr[0]); // 1
        int complex = (3 + 2) * 4; // Группировка
        System.out.println("Результат выражения с (): " + complex);
    }
}
