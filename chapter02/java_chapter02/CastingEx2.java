package Ch02;

public class CastingEx2 {
	/*정수간의 형변환
	 * 큰타입에서 작은 타입으로 변환시 데이터 손실이 생길 위험이 있음 
	 * 반대로 작은타입에서 큰타입으로 변환시 값손실이 발생하지는 않으나 크기는 차지가 된다
	 * */
	public static void main(String[] args) {
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i%d -> b=%d%n" ,i ,b);
		
		i = 300;
		b = (byte)b;
		System.out.printf("[int -> byte] i%d -> b=%d%n" ,i ,b);
		
		b = 10;
		i = (int)b;
		System.out.printf("[int -> byte] i%d -> b=%d%n" , i , b);
		
		b = -2;
		i = (int)b;
		System.out.printf("[int -> byte] i%d -> b=%d%n" ,i ,b);
		
		System.out.println("i=" + Integer.toBinaryString(i));
	}
}
