package om.syntax.class15;

public class classTask3 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS)

		String day= "Sunday";
		String reversed="";
		for(int i=day.length()-1;i>=0;i--) {
			reversed=reversed+day.charAt(i);
		}
		
		System.out.println (reversed);
	}

}
