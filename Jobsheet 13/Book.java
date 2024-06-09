public class Book {
    public String isbn;
    public String title;

    public Book(){

    }

    public Book(String isbn, String title){
        this.isbn=isbn;
        this.title=title;
    }

    public String toString(){
        return "ISBN: "+ this.isbn+" Title: "+this.title;
    }

}
