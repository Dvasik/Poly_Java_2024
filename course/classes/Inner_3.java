public class OuterClass {
    // Внутренний класс
    public class InnerClass {
        // Поля внутреннего класса
        private int innerPrivateField = 30;
        public int innerPublicField = 40;

        // Метод внутреннего класса
        public void display() {
            System.out.println("InnerClass display method");
        }

        private void privateMethod() {
            System.out.println("Private method in InnerClass");
        }
    }

    public void accessInnerClass() {
        // Внешний класс может создать экземпляр внутреннего класса
        InnerClass inner = new InnerClass();

        // Доступ к публичным членам внутреннего класса
        System.out.println("Accessing innerPublicField: " + inner.innerPublicField);
        inner.display();

        // Невозможно получить доступ к private членам внутреннего класса
        System.out.println(inner.innerPrivateField); // Ошибка компиляции
        inner.privateMethod(); // Ошибка компиляции

        // Невозможно получить доступ к полям внутреннего класса напрямую
        innerPublicField = 30; // Ошибка компиляции
    }
