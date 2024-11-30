// Первый интерфейс с неабстрактным методом
interface InterfaceA {
    default void printMessage() {
        System.out.println("Message from InterfaceA");
    }
}

// Второй интерфейс с неабстрактным методом
interface InterfaceB {
    default void printMessage() {
        System.out.println("Message from InterfaceB");
    }
}

// Класс, реализующий оба интерфейса
class MyClass implements InterfaceA, InterfaceB {
    // Переопределение метода с разрешением конфликта
    @Override
    public void printMessage() {
        // Использование метода из InterfaceA
        InterfaceA.super.printMessage();
        
        // Использование метода из InterfaceB
        InterfaceB.super.printMessage();
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.printMessage(); // Вызовет оба метода
    }
}
