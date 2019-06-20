package com.store.book.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.store.book.dao.IBookStoreDao;
import com.store.book.dao.bean.BookRowMapper;
import com.store.book.model.Book;

@Repository
public class BookStoreDaoImpl implements IBookStoreDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void createBook(Book book) {
	 int res = jdbcTemplate.update("insert into t_book (name, author, published_date, number_of_books, rack_number)" + "values(?, ?, ?, ?, ?)",
				new Object[] { book.getName(), book.getAuthor(), book.getPublishedDate(), book.getNoOfBooks(), book.getRackNo() });
	 System.out.println("Insertion query result"+ res);
	 
	 //TODO
	 // Here if it was real db, we could have retreived all the possible error messages from the storedprocedure and would have set the errorCode in the response
	}

	@Override
	public void updateBook(Book book) {
		int res = jdbcTemplate.update("update t_book " + "set author = ?, published_date = ?, number_of_books = ?, rack_number = ?" + "where name = ?",
				new Object[] {book.getAuthor(), book.getPublishedDate(), book.getNoOfBooks(), book.getRackNo(), book.getName() });
		System.out.println("Update query result"+ res);
		//TODO
		 // Here if it was real db, we could have retreived all the possible error messages from the storedprocedure and would have set the errorCode in the response
	}

	@Override
	public List<Book> getAllBooks() {
		return jdbcTemplate.query("select * from t_book", new BookRowMapper());
		//TODO
		 // Here if it was real db, we could have retreived all the possible error messages from the storedprocedure and would have set the errorCode in the response
	}

	@Override
	public Book getBookByName(String name) {
		return jdbcTemplate.queryForObject("select * from t_book where name=?", new Object[] { name },
				new BeanPropertyRowMapper<Book>(Book.class));
		//TODO
		 // Here if it was real db, we could have retreived all the possible error messages from the storedprocedure and would have set the errorCode in the response
	}
	
}
