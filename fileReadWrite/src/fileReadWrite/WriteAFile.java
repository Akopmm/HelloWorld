package fileReadWrite;

import java.io.*;

public class WriteAFile {
public static void main(String[] args){
	try{
	BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt",true));
	writer.write("Hello, FU!\n");
	writer.close();
	} catch (IOException ex){
		ex.printStackTrace();
	}
}
}
