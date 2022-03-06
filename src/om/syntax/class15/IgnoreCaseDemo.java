package om.syntax.class15;

public class IgnoreCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "KISHAN";
		String passWord = "Kishan123";

		if ("Kishan".equals(userName) && "Kishan123".equals(passWord)) {
			System.out.println("Welcome Back");
		} else {
			System.out.println("UserName or Password is not correct");
		}
		if ("Kishan".equalsIgnoreCase(userName) && "Kishan123".equals(passWord)) {
			System.out.println("welcome Back");
		} else {
			System.out.println("UserName or Password is not correct");
	}
}
}