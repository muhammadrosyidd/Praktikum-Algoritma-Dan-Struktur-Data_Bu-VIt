public class Hotelmain {
    public static void main(String[] args) {
        List hotelmalang = new List(5);
        Hotel hotel1 = new Hotel("Harris", 180000, 4.5);
        Hotel hotel2 = new Hotel("Atria", 100000, 4);
        Hotel hotel3 = new Hotel("Rays", 120000, 3);
        Hotel hotel4 = new Hotel("Savana", 200000, 5);
        Hotel hotel5 = new Hotel("Ascent", 150000, 4);

        hotelmalang.add(hotel1);
        hotelmalang.add(hotel2);
        hotelmalang.add(hotel3);
        hotelmalang.add(hotel4);
        hotelmalang.add(hotel5);

        System.out.println("Data Sebelum Disorting");
        hotelmalang.displayInfo();

        System.out.println("Data setelah disorting dengan Bubble Sort berdasarkan Harga:");
        hotelmalang.bubblesortByHarga();
        hotelmalang.displayInfo();

        System.out.println("Data setelah disorting dengan Selection Sort Berdasarkan Rating:");
        hotelmalang.seelctionsortByRating();
        hotelmalang.displayInfo();
    }
}
