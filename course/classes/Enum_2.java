public enum UserRole {
    ADMIN("Администратор", 3),
    MODERATOR("Модератор", 2),
    USER("Пользователь", 1),
    GUEST("Гость", 0);

    // Поля для хранения имени роли и уровня доступа
    private final String roleName;
    private final int accessLevel;

    // Конструктор для инициализации полей
    UserRole(String roleName, int accessLevel) {
        this.roleName = roleName;
        this.accessLevel = accessLevel;
    }

    // Дополнительный метод для проверки, есть ли доступ
    public boolean hasAccess(int requiredLevel) {
        return this.accessLevel >= requiredLevel;
    }
}
