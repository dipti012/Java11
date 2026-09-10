// Create a book class with the following attributs:
// bookId
// titel
// author
//Create a paramitalize constructor to initialize these value.
// Create a methid displayInformation() to display the book details.
//ln main(),create two book object using the constructor and display their information.
class Book {
    int bookId;
    String title;
    String author;
    Book(int bookId, String title,String author ){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
        public void displayInformation(){
            System.out.println("Book ID :" + bookId);
            System.out.println("Title :" + title);
            System.out.println("Author :" + author);


        }
    }


public class Constructor{
    public static void main(String[] args){
        Book b1 = new Book(2 , "muna madan" , "hari");
        b1.displayInformation();
       
    }
}