package com.threegs.jdo;


import javax.jdo.annotations.PersistenceCapable;

/**
 * Definition of a Book. Extends basic Product class.
 */
@PersistenceCapable
public class Book extends Product
{
    protected String author=null;

    protected String isbn=null;

    protected String publisher=null;

    public Book(String name, String description, double price, String author, String isbn, String publisher)
    {
        super(name,description,price);
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String toString()
    {
        return "Book : " + author + " - " + name;
    }
}