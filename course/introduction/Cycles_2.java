public class BreakContinueExample {
    public static void main(String[] args) {
        // Цикл от 1 до 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Пропускает итерацию, если число четное
            }
            
            // Если число равно 7, выходим из цикла
            if (i == 7) {
                break;  // Прерывает выполнение цикла, если i равно 7
            }
            
        }
    }
}
