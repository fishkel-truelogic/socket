package com.truelogic.socket;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

	private static LanConnection lc;

	public static void main(String[] args) throws IOException {
		lc = new LanConnection("127.0.0.1", 8888);
		sendMessage();
		getMessage();

	}

	private static void getMessage() throws IOException {
		 Scanner scanIn = new Scanner(lc.getClientSocket().getInputStream());
		 String sWhatever = scanIn.nextLine();
		 System.out.println(sWhatever);

	}

	private static void sendMessage() {
		Scanner scanIn = new Scanner(System.in);
		String sWhatever = scanIn.nextLine();
		lc.sendLine(sWhatever);
		scanIn.close(); 

	}
}
