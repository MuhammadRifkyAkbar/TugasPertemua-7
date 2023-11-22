package No1;

public class PrimaDanBukan {
    public static void main(String[] args) {
        System.out.println("Deret bilangan prima dan bukan dari 0 - 20:");

        System.out.println("Bilangan Prima:");
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.println(i + " (Prima)");
            }
        }

        System.out.println("\nBilangan Bukan Prima:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrima(i)) {
                System.out.println(i + " (Bukan Prima)");
            }
        }
    }

    // Metode untuk memeriksa apakah suatu bilangan adalah bilangan prima
    private static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
