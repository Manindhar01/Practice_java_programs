package sample4;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book("ponniyin selvan", "Kalki", "434r44w");
		System.out.println("Book Name: "+b.getTitle()+"\n"+"Author: "+b.getAuther()+"\n"+"ISBN: "+b.getISBN());
		Book b1=new Book("indian","shanker","12072024");
		Book b2=new Book("indain2","kamal","h86799");
		Book.add_book(b1);
		Book.add_book(b2);
		
		ArrayList<Book> bookCollection=Book.get_bookDetails();
		Book.remove_book(b1);
		
		for(Book i:bookCollection) {
			System.out.println("Book Name: "+i.getTitle()+"\n"+"Author: "+i.getAuther()+"\n"+"ISBN: "+i.getISBN());
		}
		

	}

}
