package aggregation;

import java.util.Date;

public class Book{
	private String name;
	private Date publishDate;
	private double price;
	//Aggregation
	private Author  author;
	
	
	
	
	public Book(String name, Date publishDate, double price, Author author) {
		//super(); => since all classes are extending class Object
		this.name = name;
		this.publishDate = publishDate;
		this.price = price;
		this.author = author;
		
		this.author.name = "reza";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
