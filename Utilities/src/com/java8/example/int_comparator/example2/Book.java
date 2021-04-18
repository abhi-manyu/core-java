package com.java8.example.int_comparator.example2;

public class Book
{
    private int book_id;
    private String book_name;
    private int book_page;
    
    public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int book_id, String book_name, int book_page) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_page = book_page;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getBook_page() {
		return book_page;
	}

	public void setBook_page(int book_page) {
		this.book_page = book_page;
	}
    
	@Override
	public String toString()
	{
		return book_id+"--"+book_name+"--"+book_page+"\n";
	}
}
