package Chapter03;

public class OperatorEx4 {
	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);
		
		i= -10;
		i= -i;   // 부호연산자 - 는 피연산자의 부호를 반대로 변경한 결과를 반환한다.
		System.out.println(i);
	}
}
