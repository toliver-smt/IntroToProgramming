package com.oliver.sockets;
/****************************************************************************
 * <b>Title</b>TestWebManager.java<p/>
 * <b>Description: Instantiates WebManager and calls the
 * printWebPageHTML method with example arguments</b> 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2023<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * 
 * @author Tyler Oliver
 * @version 1.0
 * @since Mar 24, 2023
 * <b>Changes: </b>
 ****************************************************************************/

public class TestWebManager {
	
	// Declare and initialize constants
	public static final String HOST = "localhost";
	public static final int PORT_NUMBER = 8045;
	
	/**
	 * Instantiates TestWebManager and calls the
	 * process to print a web page HTML
	 * @param args
	 */
	public static void main(String[] args) {
		TestWebManager twm = new TestWebManager();
		twm.process();
	}
	
	/**
	 * Calls WebManager.printWebPage() with example arguments
	 */
	public void process() {
		WebManager wm = new WebManager();
		wm.printWebPageHTML(HOST, PORT_NUMBER);
	}

}
