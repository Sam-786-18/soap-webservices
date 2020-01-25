package com.jaxrpcexample.service;

import java.rmi.RemoteException;

public class HelloServiceImpl implements IHelloService {

	@Override
	public String sayHello(String name) throws RemoteException {
		String msg="Hello:"+name+"Welcome to JaxRpc-Si";
		return msg;
	}

}
