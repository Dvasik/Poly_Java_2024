class Parent {
    public void method() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    // Без @Override компилятор не проверит названия функций, несмотря на то, что метод назван некорректно
    public void Method() {
        System.out.println("Child");
    }
}
