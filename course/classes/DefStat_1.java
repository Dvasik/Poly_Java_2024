// Интерфейс с неабстрактным и статическим методом
interface MyInterface {

    // Неабстрактный метод с дефолтной реализацией
    default void defaultMethod() {
        System.out.println("This is the default method in the interface.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("This is the static method in the interface.");
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {

    // Переопределяем неабстрактный метод интерфейса
    @Override
    public void defaultMethod() {
        System.out.println("This is the overridden default method in MyClass.");
    }

    public void invokeMethods() {
        // Вызов неабстрактного метода через this
        this.defaultMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Вызов метода интерфейса через экземпляр
        obj.invokeMethods(); // Вызывает переопределенный метод defaultMethod()

        // Вызов статического метода интерфейса без создания экземпляра
        MyInterface.staticMethod(); // Вызывает статический метод статически

        // Вызов статического метода интерфейса через экземпляр класса
        obj.staticMethod(); // Вызывает статический метод статически
    }
}
