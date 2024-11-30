// Создание StringJoiner с разделителем ", "
StringJoiner joiner = new StringJoiner(", ");

// Добавление элементов
joiner.add("Apple");
joiner.add("Banana");
joiner.add("Orange");

// Печать объединенной строки
System.out.println(joiner.toString()); // Apple, Banana, Orange

// Создание StringJoiner с разделителем ", ", префиксом "[" и суффиксом "]"
StringJoiner joiner = new StringJoiner(", ", "[", "]");

// Добавление элементов
joiner.add("Red");
joiner.add("Green");
joiner.add("Blue");

// Печать объединенной строки
System.out.println(joiner.toString()); // [Red, Green, Blue]

// Массив строк
String[] fruits = {"Apple", "Banana", "Cherry"};

// Создание StringJoiner с разделителем ", "
StringJoiner joiner = new StringJoiner(", ");

// Добавление элементов из массива
for (String fruit : fruits) {
    joiner.add(fruit)
}

// Печать объединенной строки
System.out.println(joiner.toString()); // Apple, Banana, Cherry
