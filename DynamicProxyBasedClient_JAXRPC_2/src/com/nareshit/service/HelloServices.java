package com.nareshit.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloServices extends Remote {
public String sayHello(String name)throws RemoteException;
}
