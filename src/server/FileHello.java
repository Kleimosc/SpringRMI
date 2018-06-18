package server;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileHello implements IFile{

	public byte[] getFile() {
		try {
			byte[] file = FileUtils.readFileToByteArray(new File("C:\\cloud.txt"));
			return file;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
