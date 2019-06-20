package com.store.book.dao.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.store.book.model.Book;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setName(rs.getString("name"));
		book.setAuthor(rs.getString("author"));
		book.setPublishedDate(rs.getDate("published_date"));
		book.setNoOfBooks(rs.getInt("number_of_books"));
		book.setRackNo(rs.getInt("rack_number"));
		return book;
	}

}
