// Пример интерфейса с вложенным классом
public interface Example {
    // Вложенный класс
    class NestedClass {
        public static void method() { ... }
    }
}

// Пример вызова метода вложенного класса
Example.NestedClass.method();
