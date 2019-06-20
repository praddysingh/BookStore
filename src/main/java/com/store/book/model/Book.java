package com.store.book.model;

import java.util.Date;

public class Book {
	
	String name;
	String author;
	Date publishedDate;
	Integer noOfBooks;
	Integer rackNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public Integer getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(Integer noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	public Integer getRackNo() {
		return rackNo;
	}
	public void setRackNo(Integer rackNo) {
		this.rackNo = rackNo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [name=");
		builder.append(name);
		builder.append(", author=");
		builder.append(author);
		builder.append(", publishedDate=");
		builder.append(publishedDate);
		builder.append(", noOfBooks=");
		builder.append(noOfBooks);
		builder.append(", rackNo=");
		builder.append(rackNo);
		builder.append("]");
		return builder.toString();
	}
	
}