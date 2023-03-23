package com.oliver.sockets;

import java.net.*;
import java.io.*;

public class SocketManager {

	public void getWebPage(String address, int port) {
		
		Socket socket = null;
		
		DataOutputStream out = null;
		
		InputStreamReader inputStreamReader = null;
		BufferedReader in = null;
	
		
		StringBuilder html = new StringBuilder();
		try {
			socket = new Socket(address, port);
			out = new DataOutputStream(socket.getOutputStream());
			inputStreamReader = new InputStreamReader(socket.getInputStream());
			in = new BufferedReader(inputStreamReader);
			out.writeBytes("GET /\n");
			String inData = null;
			while((inData = in.readLine()) != null) {
				html.append(inData);
			}
			System.out.println("getWebPage is running");
		} catch (IOException e) {
			System.out.println("Spot 1: " + e);
		} finally {
			//Close our sockets and streams
			try {
				if (socket != null)
					socket.close();
				if (out != null)
					out.close();
				if (inputStreamReader != null)
					inputStreamReader.close();
				if (in != null)
					in.close();
			} catch (IOException e) {
				System.out.println("Spot 2: " + e);
			}
		}
		System.out.println("my html: " + html);
	}
	
	
	
	
	public void startServerSocket(int port) {
		
		ServerSocket ss = null;
		Socket s = null;
		
		try {
			ss = new ServerSocket(port);
			s = ss.accept();
			System.out.println("new: client connected");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ss != null)
				ss.close();
				if (s != null)
				s.close();
			} catch (IOException e) {
				System.out.print("Spot 4: " + e);
			}
		}
	}

}
