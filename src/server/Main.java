package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		System.setProperty("java.rmi.server.hostname","192.168.66.26");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("server/bean-server.xml");
		
		System.out.println("server ready");
	}

}
