package day02;

public class 형변환 {
	// 자동 형변환
	public static void main(String[] args) {
		
	
	double d = 100.5; //8byte
	   int n = 200; //4byte
	   d = n;
	   System.out.println("d = " + d); //결과 : 200.0

	   char c = 'A'; //2byte
	   long l = 100;//8byte
	   l = c;
	   System.out.println("l = " + l); //결과 65
}
}
