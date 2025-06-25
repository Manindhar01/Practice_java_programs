package sample4;

import java.util.ArrayList;

public class Book {
	private String Title;
	private String Auther;
	private String ISBN;
	Book(String Title, String Auther, String ISBN){
		this.setTitle(Title);
		this.setAuther(Auther);
		this.setISBN(ISBN);
	}
	
	private static ArrayList<Book> al=new ArrayList<Book>();
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuther() {
		return Auther;
	}
	public void setAuther(String auther) {
		Auther = auther;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public static void add_book(Book book) {
		al.add(book);
	}
	public static void remove_book(Book book) {
		al.remove(book);
	}
	
	public static ArrayList<Book> get_bookDetails(){
		return al;
		
	}

}
