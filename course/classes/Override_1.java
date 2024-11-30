class Parent {
    public String method() {
        return "Parent";
    }
}

class Child1 extends Parent {
    @Override
    public String method() {
        return "Child1";
    }
}

class Child2 extends Parent {
    @Override
    public String method() {
        return "Child2";
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        System.out.println(parent.method()); // Вызов метода из класса Parent
        System.out.println(c1.method());   // Вызов переопределенного метода из класса Child1
        System.out.println(c2.method());   // Вызов переопределенного метода из класса Child2
    }
}

// Если у переопределенного и переопределяемого (из суперкласса) методов не будет совпадать тип возвращаемого значения, то в случае, если это типы возвращаемых значений не являются отнаследованными, то будет ошибка
class Parent {
    public Parent method() {
        return new Parent();
    }
}

class Child1 extends Parent {
    @Override
    public int method() { // Ошибка компиляции
        return 2;
    }
}

class Parent {
    public Parent method() {
        return new Parent();
    }
}

class Child1 extends Parent {
    @Override
    public Child1 method() { // Ошибки нет
        return new Child1();
    }
}

