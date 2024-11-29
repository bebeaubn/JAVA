package Chapter03;

public class OperatorEx13 {
	public static void main(String[] args) {
		
		char c1 = 'a';
		
	//	char c2 = c1 + 1;  컴파일 에러 발생!!!
		char c2 ='a'+1;   // 컴파일 에러 없음
		
		System.out.println(c2);
	}
	
	// 'a'+1;이 리터럴 간의 연산이기 때문에 오류가 발생하지 않는다 (형변환 필요 x)
	// 수식에 변수가 들어가 있는경우에는 컴파일러가 미리 계산을 할수없어 미리 형변환을 해주어여 한다
}
