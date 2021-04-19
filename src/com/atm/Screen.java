package com.atm;

public class Screen {
  JFrame jf;
	
	public Screen() {
		jf=new JFrame("ATM");
		jf.setSize(1000,1000);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		

	public static void main(String[] args) {
		
		new Screen();
	}
}
