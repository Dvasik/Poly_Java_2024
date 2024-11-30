try (FileInputStream fis = new FileInputStream(filePath)) {
    int data;
    // Чтение байтов из файла
    while ((data = fis.read()) != -1) {
        // Выводим каждый байт в виде символа
        System.out.print((char) data);
    }
} catch (IOException e) {
    e.printStackTrace();
}
