package Ch02;

public class CharToCode {
	/*기본형 
	 * 논리형 (bollean)
	 * - > 논리형에는 boolean 하나 밖에 없으며 boolean의 값은 true,false 두개 밖에 없다 , bollean의 기본값은 false 다.
	 * 문자형(Char)(케릭터)
	 * -> 문자형에는 Char 하나밖에 없으며 char 타입의 변수는 단 하나의 문자만 저장할수있다 ex) char ch = 'A'; // 문자 'A'를 char입 변수 ch의 저장 
	 */
	
	public static void main(String[] args) {
		
		char ch  = 'A'; // char ch = 65;
		int code = (int)ch; //ch의 저장된 값을 int타입으로 변환하여 저장한다

		System.out.printf("%c=%d(%#x)%n" , ch , code , code);
		
		char hch = '가'; // char hch = 0xAC00;
		System.out.printf("%c=%d(%#x)%n", hch , (int)hch, (int)hch);
	
	}
	
	/*인코딩 
	 * 문자 'A'를 유니코드로 인코딩하면 65가 되는것 그 반대를 디코딩이라고 한다
	 * 
	 * 유니코드란? 
	 * 문자를 숫자 형식으로 표현한 값 
	 * */
	
	
	
}
