package collection;
import java.util.*;
class Book
{
	String Name,Author,Publisher;
	int quantity,id;
	
	public Book(int id,String name,String author, String publisher,int q)
	{
		this.id = id;
		this.Name = name;
		this.Author = author;
		this.Publisher = publisher;
		this.quantity = q;
	}
}
public class ArrayListExample {
	
	public static void main(String [] args)
	{
		List<Book> list = new ArrayList<Book>();
		Book b1 = new Book(1,"The Boy with The Broken Heart","Asidf","PBP",9);
		Book b2 = new Book(2,"The Broken Heart","Asif","PBP",4);
		Book b3 = new Book(3,"The Boy ","Af","PP",3);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		System.out.println(list);
		
		for (Book b : list)
			System.out.println("Book_ID:"+b.id+"\nBook Name:"+b.Name+"\nAuhtor:"+b.Author+"\nPublisher:"+b.Publisher+"\nQuantity Available:"+b.quantity+"\n\n\n");
	}

}
