package com.bookservice.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.nareshit.dmain.Book;
import com.nareshit.service.BookServiceImpl;
import com.nareshit.service.BookServiceImplServiceLocator;

public class Test {
public static void main(String[] args) throws ServiceException, RemoteException {
BookServiceImplServiceLocator serviceImplServiceLocator=new BookServiceImplServiceLocator();
BookServiceImpl sei=serviceImplServiceLocator.getBookServiceImpl();
Book book=sei.searchBook("jaha");
System.out.println(book.getIsbn()+""+book.getAuthor()+""+book.getTitle()+""+book.getPrice());
}
}