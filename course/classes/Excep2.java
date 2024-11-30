try {
    // Генерация и обработка первого исключения
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException

    } catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("ArrayIndexOutOfBoundsException");
}

// Второе исключение не обрабатывается, программа аварийно завершится
int result = 10 / 0; // ArithmeticException
