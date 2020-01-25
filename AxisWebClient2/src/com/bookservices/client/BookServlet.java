package com.bookservices.client;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nareshit.dmain.Book;
public class BookServlet extends HttpServlet  {
BookServiceClient bookServiceClient;
public void init() {
	bookServiceClient = new BookServiceClientImpl();
}
@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String isbn=req.getParameter("isbn");
		Book book=bookServiceClient.getBook(isbn);
	
		String targetViewName= "/searchBooksResults.jsp";
		req.setAttribute("book", book);
		RequestDispatcher rd=req.getRequestDispatcher(targetViewName);
		rd.forward(req, resp);
	}
}
