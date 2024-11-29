package Chapter03;

public class OperatorEx2 {
	public static void main(String[] args) {
		int i=5 , j=0;
		
		j = i++;
		System.out.println("j=i++; 실행후 , i=" + i + ", j="  + j );
		
		
		i=5;			//결과값을 비교하기 위해 , 다시 5와0으로 변경
		j=0;
		
		j = ++i;
		System.out.println("j=++i; 실행후 , i=" + i + ", j="  + j );
		
	}
	/*전위형 j = i++; 에서는 i의 값을 증가시킨후에 읽어오므로 i의 값이 5에서 6으로 증가된 후에 j에 저장되며
	 *후위형 j = ++i; 에서는 i의 값인 5를 먼저 읽어온 다음에 i를 증가시키니깐 j에 5가 저장된다. 
	 * */
}
