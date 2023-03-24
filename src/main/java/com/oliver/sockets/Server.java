package com.oliver.sockets;


public class Server {
	
	public static void main(String[] args) {
		Server s = new Server();
		s.process("localhost", 8045);
	}
	
	public void process(String address, int port) {
		SocketManager sm = new SocketManager();
		//sm.startServerSocket(port);
		sm.getWebPage(address, port);
	}
}
