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
	public void printWebPage(String host, int portNumber) {
		StringBuilder html = new StringBuilder();
		try (Socket socket = new Socket(host, portNumber)) {
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
			BufferedReader in = new BufferedReader(inputStreamReader);
			out.writeBytes("GET /\r\n");
			String inData = null;
			while((inData = in.readLine()) != null) {
				html.append("\n" + inData);
			}
			System.out.println(html);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
