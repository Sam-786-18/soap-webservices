package com.nareshit.util;

import com.nareshit.dao.BookDAO;
import com.nareshit.dao.BookDAOImple;

public class DAOFactory {
private static BookDAO bookDAO;
static {
	bookDAO=new BookDAOImple();
}
public static BookDAO getBookDAO() {
	return bookDAO;
}
}
