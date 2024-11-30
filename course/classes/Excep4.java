// Собственный класс исключений
public class CustomException extends Exception {
    // Конструктор без параметров
    public CustomException() {
    }

    // Конструктор от сообщения, которое может быть выведено в поток ошибок и на основе другого исключения
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    // Конструктор от сообщения, которое может быть выведено в поток ошибок
    public CustomException(String message) {
        super(message);
    }

    // Констурктор на основе другого исключения
    public CustomException(Throwable cause) {
        super(cause);
    }
}
