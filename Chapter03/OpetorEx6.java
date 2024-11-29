package Chapter03;

public class OpetorEx6 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a*b);
		System.out.println(c); // 명시적 형변환
	}      // 결과값 : 44 데이터 손실이 발생하여 원래는 300이여야 하지만 44로 결과값이 나온다 ==> 데이터 손실을 방지하기 위해서 큰 자료형을 사용해야한다.
}
