import java.util.Scanner;

public class SIAKAD_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jumlahmatakuliah;
        String[] namaMK;
        int[] nilaiAngka;
        String[] nilaiHuruf;
        double[] bobotNilai;
        double[] sks;
        double ip = 0;
        double totalBobotNilai = 0;

        // Input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahmatakuliah = input.nextInt();

        // Deklarasi array dengan jumlah mata kuliah
        namaMK = new String[jumlahmatakuliah];
        nilaiAngka = new int[jumlahmatakuliah];
        nilaiHuruf = new String[jumlahmatakuliah];
        bobotNilai = new double[jumlahmatakuliah];
        sks = new double[jumlahmatakuliah];

        // Input nama mata kuliah, nilai angka, dan bobot SKS
        for (int i = 0; i < jumlahmatakuliah; i++) {
            System.out.printf("Masukkan nama mata kuliah %d: ", i + 1);
            namaMK[i] = input.next();
            System.out.printf("Masukkan nilai angka untuk %s: ", namaMK[i]);
            nilaiAngka[i] = input.nextInt();
            System.out.printf("Masukkan bobot SKS untuk %s: ", namaMK[i]);
            sks[i] = input.nextDouble();
        }

        // Konversi nilai angka ke nilai huruf dan bobot nilai
        for (int i = 0; i < jumlahmatakuliah; i++) {
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }

        // Hitung IP
        for (int i = 0; i < jumlahmatakuliah; i++) {
            ip += bobotNilai[i] * sks[i];
            totalBobotNilai += sks[i];
        }

        ip /= totalBobotNilai;

        // Tampilkan hasil
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Program hitung IP");
        System.out.println("-------------------------------------");
        for (int i = 0; i < jumlahmatakuliah; i++) {
            System.out.println("Matakuliah "+ namaMK[i]+": "+nilaiAngka[i]);
        }
        System.out.println();
        System.out.println("Hasil Konversi Nilai");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("| %-30s | %-10s | %-10s | %-10s |\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("---------------------------------------------------------------------------------------------");
        for (int i = 0; i < jumlahmatakuliah; i++) {
            System.out.printf("| %-30s | %-10.1s  | %-10s  | %-10s  | \n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("IP : %.2f\n", ip);
    }
}
