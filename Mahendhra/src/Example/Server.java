package Example;

import java.io.*;  
import java.net.*;  
public class Server {  
public static void main(String[] args){  
	try{ 
		ServerSocket socket=new ServerSocket(6666);  
		Socket s=socket.accept();  
		DataInputStream din=new DataInputStream(s.getInputStream());  
		String  message=(String)din.readUTF();  
		System.out.println("message= "+message);  
		socket.close();  
	}catch(IOException e)
	{
		System.out.println(e);
	}  
	}  
} 