package course.introduction;

import java.util.Scanner;

public class IoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Привет, " + name);
    }
}
