package Ch02;

public class CastingfEx1 {
	/* 형변환 (casting)
	 * 형변환이란 변수또는 상수의 타입을 다른 타입으로 변환하는것
	 * 
	 * 형변환 방법
	 * (타입)피연산자
	 * */
	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score=" + score);
		System.out.println("d=" +d);
		
	}
	
}
