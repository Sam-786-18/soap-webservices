package com.wheatherreport.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.wheathereport.proxy.GlobalWeather;
import com.wheathereport.proxy.GlobalWeatherSoap;
import com.wheathereport.proxy.GlobalWeather_Impl;

public class Test {
public static void main(String[] args)throws ServiceException, RemoteException {
	GlobalWeather globalWeather=new GlobalWeather_Impl();
	GlobalWeatherSoap sei=globalWeather.getGlobalWeatherSoap();
	//String result=sei.getWeather("BHOPAL","INDIA");
	String result1=sei.getCitiesByCountry("INDIA");
	System.out.println(result1);
	
	
}
}
