public class InfiniteLoopWhile {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Это бесконечный цикл while");
        }

        do {
            System.out.println("Это бесконечный цикл do-while");
        } while (true);
    }
}
