package com.nareshit.service;

public class BookServiceImplProxy implements com.nareshit.service.BookServiceImpl {
  private String _endpoint = null;
  private com.nareshit.service.BookServiceImpl bookServiceImpl = null;
  
  public BookServiceImplProxy() {
    _initBookServiceImplProxy();
  }
  
  public BookServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookServiceImplProxy();
  }
  
  private void _initBookServiceImplProxy() {
    try {
      bookServiceImpl = (new com.nareshit.service.BookServiceImplServiceLocator()).getBookServiceImpl();
      if (bookServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookServiceImpl != null)
      ((javax.xml.rpc.Stub)bookServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.nareshit.service.BookServiceImpl getBookServiceImpl() {
    if (bookServiceImpl == null)
      _initBookServiceImplProxy();
    return bookServiceImpl;
  }
  
  public com.nareshit.dmain.Book searchBook(java.lang.String isbn) throws java.rmi.RemoteException{
    if (bookServiceImpl == null)
      _initBookServiceImplProxy();
    return bookServiceImpl.searchBook(isbn);
  }
  
  
}