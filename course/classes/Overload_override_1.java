// Overload examples
class Calculator {

    // Перегрузка метода для сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегрузка метода для сложения трех чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегрузка метода для сложения чисел с плавающей запятой
    public double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Вызов перегруженных методов
        System.out.println("Сумма двух целых чисел: " + calc.add(3, 4));         // 7
        System.out.println("Сумма трех целых чисел: " + calc.add(1, 2, 3));      // 6
        System.out.println("Сумма двух чисел с плавающей запятой: " + calc.add(2.5, 3.5)); // 6.0
    }
}

// Override examples
class Animal {
    // Родительский метод
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Переопределенный метод
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    // Переопределенный метод
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Ссылается на объект типа Dog
        Animal myCat = new Cat();  // Ссылается на объект типа Cat

        // Вызов переопределенных методов
        myDog.sound();  // Выведет "Bark"
        myCat.sound();  // Выведет "Meow"
    }
}
