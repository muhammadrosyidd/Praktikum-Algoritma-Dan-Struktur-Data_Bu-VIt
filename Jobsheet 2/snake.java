public class snake {
    int x; // posisi koordinat x (mendatar)
    int y; // posisi koordinat y (vertikal)

    public snake(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void printPosition() {
        System.out.println("Posisi snake: (" + x + ", " + y + ")");
    }
}