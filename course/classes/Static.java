public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        // Вызов через имя класса
        A.printVars();

        // Вызов через экземпляр класса
        A obj = new A();
        obj.printVars();

        // Вызов из другого статического метода
        printVars();
    }
}
