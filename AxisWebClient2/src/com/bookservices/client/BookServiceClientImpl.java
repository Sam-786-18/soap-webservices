package com.bookservices.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.nareshit.dmain.Book;
import com.nareshit.service.BookServiceImpl;
import com.nareshit.service.BookServiceImplServiceLocator;

public class BookServiceClientImpl implements BookServiceClient {
     @Override
	public Book getBook(String isbn) {
		Book book=null;
		BookServiceImplServiceLocator locator=new BookServiceImplServiceLocator();
			try {
				BookServiceImpl sei=locator.getBookServiceImpl();
				book=sei.searchBook(isbn);
			}
			catch(RemoteException re) {
				re.printStackTrace();
			} catch (ServiceException e) {
			
				e.printStackTrace();
			}
		return book;
	}

}
