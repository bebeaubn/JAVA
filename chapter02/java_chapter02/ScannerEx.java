package Ch02;

import java.util.*;

public class ScannerEx {
	/* 화면에서 입력받기  - Scanner 
	 * Scanner를 입력 받으려면 import java.util.*; 추가 하여 사용
	 * 기본 형식 Scanner scanner = new Scanner(System.in); <- Scanner 클래스의 객체를 생성
	 * String input = scanner.nextLine(); <- 입력받은 내용을 input에 저장
	 * int num = Integer.parseInt(input); <- 입력받은 내용을 int타입의 값으로 변환 
	 * */ 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 하나를 입력해주세요");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용 :" + input);
		System.out.printf("num = %d%n" , num);
		
		
		
	}
}
