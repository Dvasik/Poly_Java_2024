// Базовый класс
class Parent { }

// Подклассы
class A extends Parent { }
class B extends Parent { }

// Класс с параметризированным типом
class Wrapper<T> {
    public List<T> list = new ArrayList<>();

    // Метод, который принимает тип с ограничением <? super T>
    public void printParent(List<? super T> parent) {
    }

    // Метод, который принимает тип с ограничением <? extends T>
    public void printChild(List<? extends T> child) {
    }
}

public class Main {
    public static void main(String[] args) {
        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<>();
        List<Parent> listParent = new ArrayList<>();

        Wrapper<A> a1 = new Wrapper<>();

        a1.printParent(listB); // Ошибка компиляции
        a1.printParent(listA); // Выполняется корректно
        a1.printParent(listParent); // Выполняется корректно
        
        Wrapper<Parent> p1 = new Wrapper<>();

        p1.printParent(listA); // Ошибка компиляции
        p1.printParent(listParent); // Выполняется корректно
        p1.printChild(listA); // Выполняется корректно
    }
}
