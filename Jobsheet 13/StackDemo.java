import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
    Book book1 = new Book("1234", "Dasar Pemrograman");
    Book book2 = new Book("7145", "Hafalan Shalat Delisa");
    Book book3 = new Book("3561", "Muhammad Al-Fatih");

    Stack<Book> books = new Stack<>();
    books.push(book1);
    books.push(book2);
    books.push(book3);

    Book temp = books.peek();

    if (temp != null) {
        System.out.println(temp.toString());
    }

    Book temp2 = books.pop();
    if (temp2 != null) {
        System.out.println(temp2.toString());
    }
    for(Book book:books){
        System.out.println(book.toString());
    }
    System.out.println(books);

    String searchElement = "Banana";
    int position = books.search(searchElement);

    if (position != -1) {
        System.out.println("Elemen " + searchElement + " ditemukan di posisi: " + position);
    } else {
        System.out.println("Elemen " + searchElement + " tidak ditemukan dalam stack.");
    }
}
}
