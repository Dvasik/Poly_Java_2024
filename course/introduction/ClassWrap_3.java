public class AutoBoxingUnboxingNullExample {
    public static void main(String[] args) {
        Integer obj = null; // переменная типа Integer равна null

        // Попытка автоупаковки примитивного типа в объект, который равен null
        obj = null;  // obj остается null

        // Попытка распаковки из null
        int value = obj;  // Это вызовет NullPointerException (при автораспаковке)
    }
}
