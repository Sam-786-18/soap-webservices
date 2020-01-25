package com.nareshit.client;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.ServiceFactory;

public class Test {

	public static void main(String[] args) throws ServiceException, RemoteException {
		//create the ServiceFactory object
		ServiceFactory serviceFactory=ServiceFactory.newInstance();
//create service object
		String serviceName="Hello";
		String tns="http://client.jaxrpc.com/wsdl";
		String wsdl="http://localhost:2222/RPC-Contract-First/demo?WSDL";
		Service service=serviceFactory.createService(new QName(tns,serviceName));
		//create call object
		Call call=service.createCall();
		call.setTargetEndpointAddress(wsdl);
		call.setPortTypeName(new QName(tns,"HelloServices"));
		call.setOperationName(new QName(tns,"sayHello"));
	call.setProperty(Call.SOAPACTION_URI_PROPERTY, "");
	String tns1="http://schemas.xmlsoap.org/soap/encoding/";
		call.setProperty(Call.ENCODINGSTYLE_URI_PROPERTY, tns1);
		String xsd_ns="http://www.w3.org/2001/XMLSchema";
		call.addParameter("String_1", new QName(xsd_ns, "string"), ParameterMode.IN);
		call.setReturnType(new QName(xsd_ns, "string"));
		System.out.println("hi");
		//call object is used to invoked a webservice
		String msg=(String) call.invoke(new String[] {"sateesh"});
		System.out.println(msg);
		System.out.println("hi");
	}

}
