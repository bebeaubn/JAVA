package Ch02;

public class CastingEx3 {
	/*실수간의 형변환 
	 * 작은타입에서 큰 타입으로 변환하는 경우 빈 공간을 0으로 채운다
	 * */
	public static void main(String[] args) {
		float f = 9.1234567f;
		double d = 9.1234567f;
		double d2 = (double)f;
		
		System.out.printf("f =%20.18f\n", f);
		System.out.printf("d =%20.18f\n", d);
		System.out.printf("d2 =%20.18f\n", d2);
	}
}
