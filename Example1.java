//Create  overloaded constructors:

//Constructor with only bookId
//Constructor with bookId and title
//Constructor with bookId, title, author, and price

//Create objects using each constructor and display their information.
class Book{
    int bookId;
    String title;
    String author;
    double price;
    
    Book(int bookId , String title){
        this.bookId = bookId;
        this.title = title;
    }
        Book(int bookId, String title, String author, double price ){
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.price = price;
        }
    
public void displayInfo(){
    System.out.println(bookId+ " " +title+ " "+author+" "+price);
}
}
public class Example1{
    public static void main(String[] args){
       
        Book b1 = new Book(101,"muna");
        Book b2 = new Book(102,"mudan","hari",4888);
       
        b1.displayInfo();
        b2.displayInfo();
        
    }
}

