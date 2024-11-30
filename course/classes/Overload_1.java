class Calculator {
    // Метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей точкой
    public double add(double a, double b) {
        return a + b;
    }

    // Перегруженный метод для сложения целого числа и числа с плавающей точкой
    public double add(int a, double b) {
        return a + b;
    }

    // Перегруженный метод для сложения массива чисел
    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(3, 4)); // Вызов первого метода
        System.out.println("add(int, int, int): " + calc.add(3, 4, 5)); // Вызов второго метода
        System.out.println("add(double, double): " + calc.add(3.5, 4.5)); // Вызов третьего метода
        System.out.println("add(int, double): " + calc.add(3, 4.5)); // Вызов четвертого метода
        System.out.println("add(int[]): " + calc.add(new int[]{1, 2, 3, 4})); // Вызов пятого метода
    }
}
