package com.oliver.sockets;
import java.net.*;
import java.io.*;
/****************************************************************************
 * <b>Title</b>WebManager.java<p/>
 * <b>Description: Manages web page information</b> 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2023<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * 
 * @author Tyler Oliver
 * @version 1.0
 * @since Mar 24, 2023
 * <b>Changes: </b>
 ****************************************************************************/

public class WebManager {
	
	/**
	 * prints HTML of a specified web page
	 * @param host
	 * @param portNumber
	 */
	public void printWebPageHTML(String host, int portNumber) {
		//create socket within try-with-resources so it closes
		try (Socket socket = new Socket(host, portNumber)) {
			
			//create output stream
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			
			//create input stream and wrap in in buffered reader
			InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
			BufferedReader in = new BufferedReader(inputStreamReader);
			
			//write the GET request to the output stream
			//must end in carriage return "\r" and a newline "/n"
			out.writeBytes("GET / HTTP/1.1\r\n");
			out.writeBytes("Host: " + host + "\r\n\r\n");
			
			//while loop that prints each line read
			String inData = null;
			while((inData = in.readLine()) != null) {
				System.out.println(inData);
			}
			
			//catch block
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
