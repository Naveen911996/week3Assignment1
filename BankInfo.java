package week3.Assignment1;

public class BankInfo {
	public void saving() {
		System.out.println("saving : 111111");
	}
	public void fixed() {
		System.out.println("fixed : 222222");
	}
	public void deposit() {
		System.out.println("deposit : 12345");
	}
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
		
	}
}
