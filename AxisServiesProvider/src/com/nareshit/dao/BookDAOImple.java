package com.nareshit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nareshit.dmain.Book;
import com.nareshit.util.ConnectionFactory;
import com.nareshit.util.SQLConstants;

public class BookDAOImple implements BookDAO {

	@Override
	public Book searchBook(String isbn) {
		Book book=null;
		Connection con=null;
		try {
			con=ConnectionFactory.getConnection();
			if(con!=null) {
				PreparedStatement pst=con.prepareStatement(SQLConstants.SQL_SEARCH_BOOK);
				pst.setString(1, isbn);
				ResultSet rs=pst.executeQuery();
				if(rs.next()) {
					book=new Book();
					book.setIsbn(isbn);
					book.setTitle(rs.getString("title"));
					book.setAuthor(rs.getString("author"));
					book.setPrice(rs.getDouble("price"));
				}
			}
		}
		catch(SQLException cnf) {
			System.out.println("Execption Occured while Searching book:"+cnf.getMessage());
		}
		finally {
			if(con!=null)
				try {
					con.close();
				}
			catch(SQLException se) {
				System.out.println("Execption Occured while Searching book:"+se.getMessage());
				
			}
		}
		return book;
	}

}
