public class DragonMain {
    public static void main(String[] args) {
        // Membuat objek dragon1 dengan posisi awal (0, 0) dan arah atas (1)
        Dragon dragon1 = new Dragon(0, 0, 1);
        // Membuat objek dragon2 dengan posisi awal (3, 5) dan arah kanan (2)
        Dragon dragon2 = new Dragon(2, 5, 2);

        // Mengubah arah dragon1 menjadi kanan (2)
        dragon1.changeDirection(2);
        // Mengubah posisi dragon1 dengan 3 langkah
        dragon1.move(3);

        // Mengubah arah dragon2 menjadi bawah (3)
        dragon2.changeDirection(3);
        // Mengubah posisi dragon2 dengan 2 langkah
        dragon2.move(2);

        // Mencetak status kedua dragon
        System.out.println("Status Dragon 1:");
        dragon1.printStatus();
        System.out.println("Status Dragon 2:");
        dragon2.printStatus();
    }
}
