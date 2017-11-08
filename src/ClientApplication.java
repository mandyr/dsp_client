package src;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientApplication {

	private int port = 8000;
	private String host = "localhost";
	
	private static Socket socket;
	private static DataInputStream in;
	private static DataOutputStream out;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		socket = new Socket(host,port);
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		
		out.writeInt(300);
		System.out.println(in.read());
		
	}

}
