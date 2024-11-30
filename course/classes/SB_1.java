public class StringBufferStringBuilderExample {
    public static void main(String[] args) {
        // Создаем StringBuilder для демонстрации
        StringBuilder sb = new StringBuilder("Hello");
        
        // 1. append() - добавляет текст в конец строки
        sb.append(" World");
        System.out.println("1. append(): " + sb);  // Output: Hello World
        
        // 2. insert() - вставляет текст на заданную позицию
        sb.insert(5, ",");
        System.out.println("2. insert(): " + sb);  // Output: Hello, World
        
        // 3. delete() - удаляет символы с заданных позиций
        sb.delete(5, 6);
        System.out.println("3. delete(): " + sb);  // Output: Hello World
        
        // 4. deleteCharAt() - удаляет символ на указанной позиции
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt(): " + sb);  // Output: HelloWorld
        
        // 5. reverse() - разворачивает строку
        sb.reverse();
        System.out.println("5. reverse(): " + sb);  // Output: dlroWolleH
        
        // Создаем StringBuffer для демонстрации
        StringBuffer sbf = new StringBuffer("Java");
        
        // 6. append() - добавление текста в конец
        sbf.append(" Programming");
        System.out.println("6. append() (StringBuffer): " + sbf);  // Output: Java Programming
        
        // 7. setLength() - устанавливает длину строки (обрезает или дополняет пробелами)
        sbf.setLength(4);
        System.out.println("7. setLength(): " + sbf);  // Output: Java
        
        // 8. capacity() - возвращает емкость буфера
        System.out.println("8. capacity(): " + sbf.capacity());  // Output: 24 (по умолчанию 16 + размер строки)
        
        // 9. substring() - извлекает подстроку
        String subStr = sbf.substring(0, 2);
        System.out.println("9. substring(): " + subStr);  // Output: Ja
        
        // 10. charAt() - возвращает символ на указанной позиции
        char ch = sbf.charAt(2);
        System.out.println("10. charAt(): " + ch);  // Output: v
    }
}
