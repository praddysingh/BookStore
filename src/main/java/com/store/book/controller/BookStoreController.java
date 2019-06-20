package com.store.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.book.model.Book;
import com.store.book.service.IBookStoreService;


@RestController
@RequestMapping("service/book-store/") 
public class BookStoreController {
	
	@Autowired
	private IBookStoreService bookStoreService;
	
	public IBookStoreService getBookStoreService() {
		return bookStoreService;
	}

	public void setBookStoreService(IBookStoreService bookStoreService) {
		this.bookStoreService = bookStoreService;
	}

	@PostMapping("/book")
    public ResponseEntity<?> createBook(@RequestBody Book book) 
    {
		bookStoreService.createBook(book);
		// TODO
		// Here based on the returned error code from service layer, we can think of putting the appropriate https status to the response
		return new ResponseEntity<>(HttpStatus.CREATED);
    }
	
	@PutMapping("/book")
	public ResponseEntity<?> updateBook(@RequestBody Book book) {
		bookStoreService.updateBook(book);
		// TODO
		// Here based on the returned error code from service layer, we can think of putting the appropriate https status to the response
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> books = bookStoreService.getAllBooks();
		// TODO
		// Here based on the returned error code from service layer, we can think of putting the appropriate https status to the response
		return new ResponseEntity<List<Book>>(books, HttpStatus.CREATED);
	}
	
	@GetMapping("/book/{name}")
	public ResponseEntity<Book> getBookByName(@PathVariable String name) {
		Book book = bookStoreService.getBookByName(name);
		// TODO
		// Here based on the returned error code from service layer, we can think of putting the appropriate https status to the response
		return new ResponseEntity<Book>(book, HttpStatus.CREATED);
	}

}
