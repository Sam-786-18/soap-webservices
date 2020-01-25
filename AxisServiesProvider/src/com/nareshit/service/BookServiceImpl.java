package com.nareshit.service;

import com.nareshit.dmain.Book;
import com.nareshit.util.DAOFactory;

public class BookServiceImpl implements BookService {

	@Override
	public Book searchBook(String isbn) throws RuntimeException {
		Book book=DAOFactory.getBookDAO().searchBook(isbn);
		return book;
	}

}
