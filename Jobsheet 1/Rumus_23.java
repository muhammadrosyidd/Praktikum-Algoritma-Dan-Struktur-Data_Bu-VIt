import java.util.Scanner;

public class Rumus_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("==============================");
            System.out.println("              Menu            ");
            System.out.println("==============================");
            System.out.println("1. Menghitung kecepatan");
            System.out.println("2. Menghitung jarak");
            System.out.println("3. Menghitung waktu");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda    : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

            System.out.println();
        } while (pilihan != 4);

        input.close();
    }

    public static void hitungKecepatan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (dalam km): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan waktu (dalam jam): ");
        double waktu = input.nextDouble();
        System.out.println("");
        double kecepatan = jarak / waktu;
        System.out.println("Kecepatannya adalah: " + kecepatan + " km/jam");
        System.out.println("-------------------------------");
    }

    public static void hitungJarak() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (dalam km/jam): ");
        double kecepatan = input.nextDouble();
        System.out.print("Masukkan waktu (dalam jam): ");
        double waktu = input.nextDouble();
        System.out.println("");
        double jarak = kecepatan * waktu;
        System.out.println("Jarak yang ditempuh adalah: " + jarak + " km");
        System.out.println("-------------------------------");
    }

    public static void hitungWaktu() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (dalam km): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan kecepatan (dalam km/jam): ");
        double kecepatan = input.nextDouble();
        System.out.println("");
        double waktu = jarak / kecepatan;
        System.out.println("Waktu yang dibutuhkan adalah: " + waktu + " jam");
        System.out.println("-------------------------------");
    }
}