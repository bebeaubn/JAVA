package Ch02;

public class FloatEx1 {
	/*실수형
	 * 실수를 저장하기 위한 타입 float , double 두가지가 있다
	 * float (bit:32 , byte:4)
	 * double(bit:64 , byte:8)
	 * 정수형과 달리 실수형애서는 오버플로우가 발생하면 변수의 값은 무한대가 됨
	 * 정수형에 없는 언더플로우(underflow)가 있는데 언더플로우는 실수형으로 표현할수없는 아주 작은값임 즉 양의 최소값보다 작은 값이 되는 경우임
	 * */
	
	public static void main(String[] args) {
		float f =9.1234567890123456789f;
		float f2 =1.234567890123456789f;
		double d = 9.1234567890123456789d;
		
		System.out.println("      123456789012345678901234%n");
		System.out.printf("f   : %f%n" , f); // 소수점 이하 6째 자리까지 출력 , 출력값 7자리에서 반올림되어짐 9.123457
		System.out.printf("f  : %24.20f%n" , f ); 
		System.out.printf("f2  : %24.20f%n" , f2 );
		System.out.printf("d  : %24.20f%n" , d );
	}
}
