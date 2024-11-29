package Chapter03;

public class OperatorEx8 {
	public static void main(String[] args) {
		int a = 1_000_000;     // 1.000.000 백만
		int b = 2_000_000;     // 2.000.000 이백만
		
		long c = a*b;
		System.out.println(c);
	}
			//  int타입ㅇ과 int타입의 연산결과는 int 타입이므로 long으로 자동 형변환 되어도 값은 변하지 않는다
}
