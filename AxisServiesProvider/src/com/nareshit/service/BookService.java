package com.nareshit.service;


import java.rmi.Remote;

import com.nareshit.dmain.Book;

public interface BookService extends Remote {
public Book searchBook(String isbn)throws RuntimeException;
}
