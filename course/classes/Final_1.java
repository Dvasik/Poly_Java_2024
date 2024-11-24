// Родительский класс
class Parent {
    final void method() {
        System.out.println("Метод суперкласса");
    }
}

// Подкласс
class Child extends Parent {
    void method() {
        System.out.println("Метод подкласса"); // Такая функция невозможна
    }
}
