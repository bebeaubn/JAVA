package java_chapter02_variable;

public class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "Va";
		String Str = name + 8.0;
		
		System.out.println(name);
		System.out.println(Str);
		System.out.println(7 + " "); //7
		System.out.println(" " + 7 );// 7(공백포함)
		System.out.println(7 + "");//7
		System.out.println("" + 7 );//7
		System.out.println(""+ "");//빈공백
		System.out.println(7 + 7 +""); //14
		System.out.println("" + 7 + 7);//77 
	}
}
