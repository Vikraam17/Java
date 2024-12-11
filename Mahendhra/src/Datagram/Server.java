package Datagram;

import java.io.IOException;
import java.net.*;
public class Server {
	public static void main(String[] args) throws IOException {
		DatagramSocket dgs=new DatagramSocket();
		String msg="Hi client";
		InetAddress ip=InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),ip,9999);
		dgs.send(dp);
		dgs.close();
	}
} 