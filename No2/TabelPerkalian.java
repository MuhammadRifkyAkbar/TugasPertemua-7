package No2;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (lebih kecil atau sama dengan 10): ");
        int n = scanner.nextInt();

        if (n <= 10) {
            System.out.println("Tabel Perkalian " + n + " x " + n + ":");
            tampilkanTabelPerkalian(n);
        } else {
            System.out.println("Masukkan nilai n lebih kecil atau sama dengan 10.");
        }
    }

    private static void tampilkanTabelPerkalian(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

