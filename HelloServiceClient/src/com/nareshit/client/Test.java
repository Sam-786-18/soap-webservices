package com.nareshit.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.nareshit.proxy.Hello;
import com.nareshit.proxy.Hello_Impl;
import com.nareshit.proxy.IHelloService;

public class Test {
public static void main(String[]args)throws ServiceException,RemoteException {
	Hello hello=new Hello_Impl();
    IHelloService sei=hello.getIHelloServicePort();
	String name=sei.sayHello("sathish");
	System.out.println(name);
}
}
