package ch05.first;

import java.awt.Toolkit;

public class BeepEx {
	
	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// ctrl + shift + o
		
		for(int i=0; i<5; ++i) {
			toolkit.beep();
			try {	Thread.sleep(500);	} catch(Exception e) {}
			
		}
		for(int i=0; i<5; ++i) {
			System.out.println("12");
			try {	Thread.sleep(500);	} catch(Exception e) {}
			
		}
	
	}

}
