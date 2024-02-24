public class snakemain {
    public static void main(String[] args) {
        // Membuat objek snake1 dengan posisi awal (0, 0)
        snake snake1 = new snake(0, 0);
        // Membuat objek snake2 dengan posisi awal (3, 5)
        snake snake2 = new snake(3, 5);

        // Mengubah posisi snake1
        snake1.moveRight(); // Pindahkan ke kanan (x+1)
        snake1.moveUp();    // Pindahkan ke atas (y+1)

        // Mengubah posisi snake2
        snake2.moveLeft();  // Pindahkan ke kiri (x-1)
        snake2.moveDown();  // Pindahkan ke bawah (y-1)

        // Mencetak posisi kedua snake
        System.out.println("Posisi Snake 1:");
        snake1.printPosition();
        System.out.println("Posisi Snake 2:");
        snake2.printPosition();
    }
}