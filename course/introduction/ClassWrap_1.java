public class DecodeExamples {
    public static void main(String[] args) {
        // Пример с Boolean
        System.out.println("Boolean (true): " + Boolean.decode("true"));  // true
        System.out.println("Boolean (1): " + Boolean.decode("1"));        // true
        System.out.println("Boolean (false): " + Boolean.decode("false"));// false
        System.out.println("Boolean (0): " + Boolean.decode("0"));        // false
       
        System.out.println(Boolean.decode("invalid")); // Ошибка

        // Пример с Integer
        System.out.println("Integer (десятичное): " + Integer.decode("42"));      // 42
        System.out.println("Integer (шестнадцатеричное): " + Integer.decode("0x2A")); // 42
        System.out.println("Integer (восьмеричное): " + Integer.decode("052"));     // 42
        
        System.out.println(Integer.decode("invalid")); // Ошибка

        // Пример с Byte
        System.out.println("Byte (десятичное): " + Byte.decode("42"));          // 42
        System.out.println("Byte (шестнадцатеричное): " + Byte.decode("0x2A"));   // 42
        System.out.println("Byte (восьмеричное): " + Byte.decode("052"));       // 42
        
        System.out.println(Byte.decode("256"));  // Ошибка: 256 не входит в диапазон byte

        // Пример с Short
        System.out.println("Short (десятичное): " + Short.decode("42"));          // 42
        System.out.println("Short (шестнадцатеричное): " + Short.decode("0x2A"));  // 42
        System.out.println("Short (восьмеричное): " + Short.decode("052"));       // 42

        System.out.println(Short.decode("100000")); // Ошибка: 100000 не входит в диапазон short

        // Пример с Long
        System.out.println("Long (десятичное): " + Long.decode("42"));            // 42
        System.out.println("Long (шестнадцатеричное): " + Long.decode("0x2A"));    // 42
        System.out.println("Long (восьмеричное): " + Long.decode("052"));         // 42

        // Пример с Float
        System.out.println("Float (десятичное): " + Float.decode("42.5"));      // 42.5
        System.out.println("Float (шестнадцатеричное): " + Float.decode("0x2A")); // Ошибка

        // Пример с Double
        System.out.println("Double (десятичное): " + Double.decode("42.5"));     // 42.5
        System.out.println("Double (шестнадцатеричное): " + Double.decode("0x2A")); // Ошибка

    }
}
