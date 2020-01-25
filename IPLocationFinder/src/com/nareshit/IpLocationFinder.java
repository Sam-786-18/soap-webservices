package com.nareshit;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.wheatherreport.proxy.GeoIP;
import com.wheatherreport.proxy.GeoIPService;
import com.wheatherreport.proxy.GeoIPServiceSoap;
import com.wheatherreport.proxy.GeoIPService_Impl;

public class IpLocationFinder {
	public static void main(String[] args) throws ServiceException, RemoteException {
		if (args.length != 1) {
			System.out.println("you need to pass in one ip address");

		} else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService_Impl();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println("country:" +geoIP.getCountryName());
		}

	}

}
