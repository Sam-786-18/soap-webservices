package com.nt.service;

import java.rmi.RemoteException;

import com.jaxrpc.client.Hello;

public class HelloServices implements Hello {

	@Override
	public String sayhello(String name) throws RemoteException {
		return  "mr "+name+ "WELCOME TO WEBSERVICE";
	}

}
