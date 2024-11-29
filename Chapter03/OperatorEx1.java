package Chapter03;

public class OperatorEx1 {
	public static void main(String[] args) {
		int i = 5;
		i++;        // i=i+1과 같은 의미이다 . ++i 오 바꿔써도 결과는 같다.
		System.out.println(i);
		
		i = 5;  // 결과를 비교하기위해 다시 값을 5로 변경
		++i;
		System.out.println(i);
	}

}
