package Chapter03;

public class OperatorEx11 {
	public static void main(String[] args) {
		char  a ='a';
		char  b ='b';
		char  zero ='0';
		char  two ='2';
		
		System.out.printf("'%c' - '%c' =%d%n" ,b ,a, b-a);
		System.out.printf("'%c' -'%c' =%d%n", two ,zero,two-zero );
		System.out.printf("'%c' =%d%n", a ,(int)a);
		System.out.printf("'%c' =%d%n", b ,(int)b);
		System.out.printf("'%c' =%d%n", zero ,(int)zero);
		System.out.printf("'%c' =%d%n", two ,(int)two);
	}
	// 사직연산의 피연산자로는 숫자뿐만 아니라 문자도 가능하다.
}
