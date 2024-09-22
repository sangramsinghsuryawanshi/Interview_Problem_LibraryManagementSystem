package com.project.L.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookid;
	private String title;
	private String author;
	private int quantity;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Book(int bookid, String title, String author, int quantity) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", quantity=" + quantity + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
