package com.nareshit.service;

import java.rmi.RemoteException;

public class HelloServiceImpl implements IHelloService {

	@Override
	public String sayHello(String name) throws RemoteException {
		
		return "Hello:"+name+"welcome to JAX-RPC-Contract-First-Approach ";
	}

}
