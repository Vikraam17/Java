package Datagram;

import java.util.*;
import java.net.*;
public class Client {
	public static void main(String args[]) throws Exception 
	{
		DatagramSocket socket = new DatagramSocket(9999);
		byte[] buffer=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buffer,buffer.length);
		socket.receive(packet);
		String msg=new String(packet.getData(),0,packet.getLength());
		System.out.println(msg);
		socket.close();
	}
}
