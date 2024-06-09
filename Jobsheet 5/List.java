public class List {
    Hotel[] listhotel;
    int index;

    public List(int kuota) {
        listhotel = new Hotel[kuota];
    }

    public void add(Hotel hotel) {
        if (index < listhotel.length) {
            listhotel[index] = hotel;
            index++;
        } else {
            System.out.println("List Hotel yang Tersedia sudah Penuh");
        }
    }

    public void displayInfo() {
        for (Hotel hotel : listhotel) {
            if (hotel != null) {
                hotel.displayInfo();
            }
        }
    }

    public void bubblesortByHarga() {
        int n = listhotel.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listhotel[j].harga > listhotel[j + 1].harga) {
                    Hotel temp = listhotel[j];
                    listhotel[j] = listhotel[j + 1];
                    listhotel[j + 1] = temp;
                }
            }
        }
    }

    public void seelctionsortByRating() {
        int n = listhotel.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (listhotel[j].rating > listhotel[minIndex].rating) {
                    minIndex = j;
                }
            }
            Hotel temp = listhotel[minIndex];
            listhotel[minIndex] = listhotel[i];
            listhotel[i] = temp;
        }
    }
}
