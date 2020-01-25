/**
 * BookServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nareshit.service;

public interface BookServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getBookServiceImplAddress();

    public com.nareshit.service.BookServiceImpl getBookServiceImpl() throws javax.xml.rpc.ServiceException;

    public com.nareshit.service.BookServiceImpl getBookServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
