package Ch02;

public class CastingEx4 {
	/*실수형을 정수형으로 변환*/
	public static void main(String[] args) {
		int i = 91234567;    // 8자리의 10진수
		float f = (float)i;  //int를 float로 형변환
		int i2 = (int)f;     //float를 다시 int로 형변환	
		
		double d = (double)i; // int를 다시 double로 형변환 
		int i3 = (int)d;      //double를 다시 int 로 형변환
		
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f i2=%d\n" , f, i2);
		System.out.printf("d=%f i3=%d\n", f2 , i4);

	}
	/*자동형변환 규칙
	 * 1. boolean 형을 제외한 나머지 기본형은 서로 형 뱐환이 가능하다
	 * 2. 기본형과 참조형은 서로 형변환을 할수없다
	 * 3. 서로 다른 타입의 변수간의 연산은 형변환을 하는것이 원칙이지만, 값의 범위가 작은 타입에서 큰 타입의로의 형변환은 생략할수 있다.
	 * */
}
