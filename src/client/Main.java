package client;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("client/bean-client.xml");
        GetFile fileHello = (GetFile) factory.getBean("clientGetFile");
        GetString stringHello = (GetString) factory.getBean("clientGetString");

        System.out.println(stringHello.getiString().getString("test RMI string"));
        
        File file = new File("cloud.txt");
        try {
			FileUtils.writeByteArrayToFile(file, fileHello.getiFile().getFile());
			System.out.println(file.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	

}
