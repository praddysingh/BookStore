package com.store.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.store.book.dao.IBookStoreDao;
import com.store.book.model.Book;
import com.store.book.service.IBookStoreService;

@Service
public class BookStoreServiceImpl implements IBookStoreService{

	@Autowired
	IBookStoreDao bookStoreDao;
	
	public IBookStoreDao getBookStoreDao() {
		return bookStoreDao;
	}

	public void setBookStoreDao(IBookStoreDao bookStoreDao) {
		this.bookStoreDao = bookStoreDao;
	}

	@Override
	public void createBook(Book book) {
		
		try {
			bookStoreDao.createBook(book);
		} catch (DataAccessException e) {
			System.out.println("error querying the database for insertion");
		}
	}

	@Override
	public void updateBook(Book book) {
		
		try {
			bookStoreDao.updateBook(book);
		} catch (DataAccessException e) {
			System.out.println("Error querying the database for update");
		}
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = null;
		try {
			books = bookStoreDao.getAllBooks();
		} catch (DataAccessException e) {
			System.out.println("Error querying the database for fetching all books");
		}
		return books;
	}

	@Override
	public Book getBookByName(String name) {
		Book book = null;
		try {
			book = bookStoreDao.getBookByName(name);
		} catch (DataAccessException e) {
			System.out.println("Error querying the database for fetching a book");
		}
		return book;
	}
	

}
