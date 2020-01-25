package com.nareshit.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

import com.nareshit.service.IHelloService;

public class Test {

static String serviceName="Hello";
static String portName="hello";

public static void main(String[] args) throws ServiceException, RemoteException, MalformedURLException {
ServiceFactory factory=ServiceFactory.newInstance();
URL wsdl=new URL("");
String tns=("");
Service service=factory.createService((wsdl),new QName(tns,serviceName));
IHelloService  sei=(IHelloService) service.getPort(new QName(tns,portName),IHelloService.class);
String msg=sei.sayHello("satish");
System.out.println(msg);
}
}