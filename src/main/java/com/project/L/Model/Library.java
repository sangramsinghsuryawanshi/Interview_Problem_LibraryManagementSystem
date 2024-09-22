package com.project.L.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Library {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String addBook;
    private int borrowBook;  
    private String returnBook;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddBook() {
        return addBook;
    }

    public void setAddBook(String addBook) {
        this.addBook = addBook;
    }

    public int getBorrowBook() {  // Corrected the method name
        return borrowBook;
    }

    public void setBorrowBook(int borrowBook) {  // Corrected the method name
        this.borrowBook = borrowBook;
    }

    public String getReturnBook() {
        return returnBook;
    }

    public void setReturnBook(String returnBook) {
        this.returnBook = returnBook;
    }

    public Library(int id, String addBook, int borrowBook, String returnBook) {
        super();
        this.id = id;
        this.addBook = addBook;
        this.borrowBook = borrowBook; 
        this.returnBook = returnBook;
    }

    // Default constructor
    public Library() {
        super();
    }

    @Override
    public String toString() {
        return "Library [id=" + id + ", addBook=" + addBook + ", borrowBook=" + borrowBook + ", returnBook="
                + returnBook + "]";
    }
}
