package No1;
import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[] args) {
        int nAwal, nAkhir;
         Scanner scanner = new Scanner(System.in);

         System.out.print("Masukkan Nilai Awal: ");
         nAwal = scanner.nextInt();
         System.out.print("Masukkan Nilai Akhir: ");
         nAkhir = scanner.nextInt();
         System.out.println("Bilangan Ganjil:");
         for (int i = nAwal; i <= nAkhir; i++) {
             if (i % 2 != 0) {
                 System.out.println(i + " (Ganjil)");
             }
         }
         System.out.println("Bilangan Genap:");
         for (int i = nAwal; i <= nAkhir; i++) {
             if (i % 2 == 0) {
                 System.out.println(i + " (Genap)");
             }
         }
    }
}

