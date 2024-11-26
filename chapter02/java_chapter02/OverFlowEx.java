package Ch02;

public class OverFlowEx {
	/*
	 * 정수형 
	 * byte(1) -> short(2) -> int(4) -> long(8)
	 * n비트로 표현할수있는 정수의 개수: 2의n개 (= 2의n-1개 +2의n-1개 )
	 * n비트로 표현할수는 부호있는 정수의 범위 :-2의n-1개 ~ 2의n-1개 
	 * 
	 *오버플로우 (overflow)
	 *타입이 표현할수있는 값의 범위를 넘어서는것을 오버플로우라고 한다 
	 *애초에 오버플로우가 발생하지않게 충분한 크기의 타입을 선택해서 사용한다.
	 *부호있는 정수는 부호비트가 0에서 1이 될떄 오버플로우가 발생한다.    
	 * */
	
	public static void main(String[] args) {
		short sMin = -32767;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1 = " + (short) (sMin-1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short) (sMax+1));
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)-- cMin);
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1 = " + (int)++cMax);
	}

}
