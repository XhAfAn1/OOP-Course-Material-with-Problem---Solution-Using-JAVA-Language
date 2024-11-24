
package Lab5;
import java.util.Scanner;

class Book{
    int ISBN;
    String bookTitle;
    int numberOfPages;
    static int count;
    
    Book(){
    count++;
    }
    Book(int isbn, String bt,int p){
        
        ISBN=isbn;
        bookTitle=bt;
        numberOfPages=p;
    
    }
    public String toString(){
        String s="ISBN :"+ISBN+", Book Title : "+bookTitle+", Number of pages : "+numberOfPages;
        return s;
    }
    
    public int compareTo(Book a){
        if(numberOfPages>a.numberOfPages){
            return 1;
        }
        else 
            return 0;
    }
    public static int getCount(){
        return count;
    }
    public int numberOfPages(){
        return numberOfPages;
    }
    
    
    
    
    
}






public class problem2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       Book[] book= new Book[5];
        for (int i = 0; i < book.length; i++) {
            book[i]=new Book();
            System.out.println("Enter book ISBN , Book Title , Page Number of book no:"+i);
            book[i].ISBN=inp.nextInt();
            book[i].bookTitle=inp.next();
            book[i].numberOfPages=inp.nextInt();
            
        }
        System.out.println(Book.getCount());
        displayAll(book);
        isHeavier(book[3]);
        
    }
    public static void displayAll(Book[] b){
        for (int i = 0; i < b.length; i++) {
            b[i].toString();
        }
    }
    
    public static boolean isHeavier(Book b){
        if(b.numberOfPages>500)
            return true;
        else
            return false;
    }
}
