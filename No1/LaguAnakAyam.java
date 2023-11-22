package No1;

public class LaguAnakAyam {
    public static void main(String[] args) {
        int jumlahAnakAyam = 5; // Ganti dengan jumlah anak ayam yang diinginkan

        System.out.println("Lagu Anak Ayam Turun " + jumlahAnakAyam);

        for (int i = jumlahAnakAyam; i >= 1; i--) {
            System.out.println("Anak ayam turun " + i + "\nmati satu tinggal " + (i - 1));

            System.out.println("Tek kotek-kotek kotek\nanak ayam turunlah berkotek");
            System.out.println("");
        }

        System.out.println("Mama ayam pulang, pulang " + jumlahAnakAyam);
    }
}

