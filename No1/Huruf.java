package No1;

public class Huruf {
    public static void main(String[] args) {
        System.out.println("Deret huruf Z - A:");

        System.out.println("Menggunakan perulangan for:");
        deretHurufFor();
    }

    private static void deretHurufFor() {
        for (char huruf = 'Z'; huruf >= 'A'; huruf--) {
            System.out.println(huruf);
        }
    }
}