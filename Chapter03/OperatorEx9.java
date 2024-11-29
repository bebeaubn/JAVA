package Chapter03;

public class OperatorEx9 {
	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a=" + a);  // 데이터 손실
		System.out.println("b=" + b);  // 형변환으로 인하여 데이터 손실 발생 x
	}
}
