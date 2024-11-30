public class OuterClass {
    private int privateField = 10;
    protected int protectedField = 20;
    public int publicField = 30;
    int defaultField = 40;

    private void privateMethod() {
        System.out.println("Private method in OuterClass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in OuterClass");
    }

    public void publicMethod() {
        System.out.println("Public method in OuterClass");
    }

    void defaultMethod() {
        System.out.println("Default method in OuterClass");
    }

    public class InnerClass {
        public void accessOuterClassMembers() {
            // Внутренний класс имеет доступ ко всем членам внешнего класса
            System.out.println("Accessing private field: " + privateField);
            System.out.println("Accessing protected field: " + protectedField);
            System.out.println("Accessing public field: " + publicField);
            System.out.println("Accessing default field: " + defaultField);
            
            // Внутренний класс может вызывать все методы внешнего класса
            privateMethod();
            protectedMethod();
            publicMethod();
            defaultMethod();
        }
    }
}
