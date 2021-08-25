package week3.Assignment1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("studentId : "+ id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("studentId : "+ id + " and " + "student name : " + name);
	}
	public void getStudentInfo(String email, long phoneNo) {
		System.out.println("studentemail : "+ email + " and " + "student phoneNo : " + phoneNo);
	}
	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(12345);
		std.getStudentInfo(12345, "B.Naveen");
		std.getStudentInfo("naveenkumarbalusamy@gmail.com", 9487151573L);
	}
}
