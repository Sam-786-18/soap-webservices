package com.nareshit.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

import com.nareshit.service.HelloServices;



public class Test {

static String serviceName="HelloServices";
static String portName="helloSOAPPort";

public static void main(String[] args) throws ServiceException, RemoteException, MalformedURLException {
ServiceFactory factory=ServiceFactory.newInstance();
URL wsdl=new URL("http://localhost:2222/RPC-Contract-First/demo?WSDL");
String tns=("http://client.jaxrpc.com/wsdl");
Service service=factory.createService((wsdl),new QName(tns,serviceName));
HelloServices  sei=(HelloServices) service.getPort(new QName(tns,portName),HelloServices.class);
String msg=sei.sayHello("satish");
System.out.println(msg);
}
}