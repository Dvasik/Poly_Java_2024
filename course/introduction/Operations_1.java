public class Test {
    public static void main(String args[]) {
        int a = 5;
        String str = "Hello";

        // Операторы присваивания
        a = 5;
        str = "Hello";

        // +=, -=, *=, /=, %=
        a += 3;  // a = a + 3
        str += " World";  // str = str + " World"
        a -= 2;  // a = a - 2
        a *= 4;  // a = a * 4
        a /= 2;  // a = a / 2
        a %= 3;  // a = a % 3

        // Тернарный оператор ?:
        String result = (a > 3) ? "Greater" : "Smaller";

        // Логические операторы ||, &&
        boolean b = (a > 3) || (a < 1);
        b = (a > 3) && (a < 10);

        // Побитовые операторы |, ^, &
        int bitResult = a | 2;  // Побитовое ИЛИ
        bitResult = a ^ 2;  // Побитовое исключающее ИЛИ
        bitResult = a & 2;  // Побитовое И

        // Операторы равенства ==, !=
        boolean isEqual = (a == 5);
        boolean isNotEqual = (str != "Hello");

        // Операторы сравнения >, >=, <, <=
        boolean comparison = (a > 3) && (a <= 10);

        // Операторы сдвига >>, >>>, <<
        int shifted = a >> 1;  // Сдвиг вправо
        shifted = a << 1;  // Сдвиг влево
        shifted = a >>> 1; // Сдвиг вправо без учёта знака

        // Арифметические операторы +, -, *, /, %
        int sum = a + 3;
        int difference = a - 2;
        int product = a * 2;
        int quotient = a / 2;
        int remainder = a % 2;

        // Инкремент и декремент ++, --
        // Префиксная форма
        ++a;  // Увеличение a на 1
        --a;  // Уменьшение a на 1

        // Постфиксная форма
        a++;  // Увеличение после использования значения
        a--;  // Уменьшение после использования значения

        // Унарные операторы ~ и !
        int negation = ~a;  // Побитовая инверсия
        boolean not = !b;  // Логическое НЕ

        // Скобки ( ) и индексы [ ]
        int resultInBrackets = (a + 2) * 3;  // Приоритет в скобках
        int[] arr = {1, 2, 3};
        int element = arr[1];  // Доступ к элементу массива
    }
}
