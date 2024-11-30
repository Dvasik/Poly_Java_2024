// Создаем объект Scanner для чтения из файла
try (Scanner scan = new Scanner(new FileReader("in.txt"))) {
    // Читаем файл построчно
    while (scan.hasNextLine()) {
        String line = scan.nextLine();
        System.out.println(line);
    }
} catch (FileNotFoundException e) {
    System.err.println(e);
}
