package org.system;



public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktopSize : 15 inch");
	}
	public static void main(String[] args) {
	Computer comp = new Computer();
	comp.computerModel();
	Desktop desk = new Desktop();
	desk.desktopSize();
	}
}
