package om.syntax.class15;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "How are @you @guys @";
		System.out.println(name.lastIndexOf("@"));
		System.out.println(name.lastIndexOf("are"));
		System.out.println(" ------ --------");
		System.out.println("name.indexOf(\"@\") "+name.lastIndexOf("@"));
		System.out.println(name.lastIndexOf("@"));
		System.out.println(name.indexOf("@"));
		System.out.println(name.indexOf(name,0));
		System.out.println(name.indexOf("%"));
		//advance we can ignore it for now 
		System.out.println(name.indexOf("@",8+1));
		System.out.println(name.indexOf("@",name.indexOf("@")+1));
		System.out.println("_______________________________________________");
		String name1 = "How @you @guys";
		System.out.println(name.indexOf("@",4+1));
	}

}
