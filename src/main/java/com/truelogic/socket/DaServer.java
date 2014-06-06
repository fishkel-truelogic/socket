package com.truelogic.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;


public class DaServer extends Thread {

  public void run() {
    ServerSocket server;
	try {
		server = new ServerSocket(8888);
	
		Scanner scan;
		scan = new Scanner(server.accept().getInputStream());
	

		while (scan.hasNextLine()) {
			System.out.println("from socket: " + scan.nextLine());
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
  }

}
