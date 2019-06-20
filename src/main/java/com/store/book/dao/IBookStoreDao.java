package com.store.book.dao;

import java.util.List;

import com.store.book.model.Book;

public interface IBookStoreDao {
	
	public void createBook(Book book);
	
	public void updateBook(Book book);
	
	public List<Book> getAllBooks();
	
	public Book getBookByName(String id);

}
