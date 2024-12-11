package Day2;


import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException  {
		Socket s=new Socket("localhost",6666);
		System.out.println("Server Accepted");
	}
}
