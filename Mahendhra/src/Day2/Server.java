package Day2;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
		public static void main(String[] args) {
			try {
				System.out.println("Waiting for client....");
				ServerSocket ss=new ServerSocket(6666);
				Socket s=ss.accept();
				System.out.println("Process Completed");
				ss.close();
		}catch(IOException e) {
			
			System.out.println(e);
		}
	}
}
