import java.util.Scanner;

public class ScavengerMain {
    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();
        game.addPoint("Apa nama ibukota Indonesia?", "Jakarta");
        game.addPoint("Berapakah hasil 5 + 5 x 5?", "30");
        game.addPoint("Apa warna rumput?", "Hijau");
        game.addPoint("Apa Lambang Negara Indonesia?", "Garuda");

        game.displayPoints();

        Scanner sc15 = new Scanner(System.in);
        while (game.currentpoint != null) {
            game.displayCurrentPoint();
            System.out.print("Jawab atau ketik 'kembali' untuk kembali ke point sebelumnya: ");
            String answer = sc15.nextLine();
            if (answer.equalsIgnoreCase("kembali")) {
                if (game.goToPreviousPoint()) {
                    System.out.println("Kembali ke point sebelumnya.");
                } else {
                    System.out.println("Tidak bisa kembali lagi.");
                }
            } else if (game.checkAnswer(answer)) {
                System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }
        System.out.println("Selamat! Anda telah menyelesaikan game.");
        sc15.close();
        System.exit(0);
    }
}
