public class ScavengerHunt {
    nodetugas head;
    nodetugas tail;
    nodetugas currentpoint;

    public ScavengerHunt() {
        this.head = null;
        this.tail = null;
        this.currentpoint = null;
    }

    // Tambah point baru ke dalam linked list
    public void addPoint(String question, String answer) {
        nodetugas newPoint = new nodetugas(question, answer);
        if (head == null) {
            head = tail = currentpoint = newPoint;
        } else {
            tail.next = newPoint;
            newPoint.prev = tail;
            tail = newPoint;
        }
    }

    // Tampilkan semua points
    public void displayPoints() {
        nodetugas current = head;
        int index = 1;
        while (current != null) {
            System.out.println("Point " + index + ": " + current.question);
            current = current.next;
            index++;
        }
    }

    // Periksa jawaban dan pindahkan ke titik berikutnya jika benar
    public boolean checkAnswer(String userAnswer) {
        if (currentpoint != null && currentpoint.answer.equals(userAnswer)) {
            currentpoint = currentpoint.next;
            return true;
        }
        return false;
    }

    // Kembali ke titik sebelumnya
    public boolean goToPreviousPoint() {
        if (currentpoint != null && currentpoint.prev != null) {
            currentpoint = currentpoint.prev;
            return true;
        }
        return false;
    }

    // Kembali ke titik saat ini
    public void displayCurrentPoint() {
        if (currentpoint != null) {
            System.out.println("Current Point: " + currentpoint.question);
        } else {
            System.out.println("No current point.");
        }
    }
}
