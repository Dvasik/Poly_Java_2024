// В такой конструкции метод close() вызывается неявно для всех потоков. Это и обеспечивает интерфейс AutoCloseable
try (
        Writer writer = new FileWriter(fileIn);
        OutputStream out = new FileOutputStream(fileOut)
)
