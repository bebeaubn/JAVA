package day02;

public class 강제형변환 {
	public static void main(String[] args) {
		
	
	 char c = 'B'; //2byte
	   int n = c + 1; //여기까지는 프로모션 캐스팅
	   c = n; //c는 2byte, n은 4byte이므로 오류 발생   
	   c = (char)n; //이렇게 수정
	   System.out.println("c = " + c);

	   float f = 5.5f;
	   int n = 0;
	   n = (int)f; //같은 4byte여도 자료형이 일치하지 않으면 대입되지 않음. 고로 캐스팅
	   System.out.println("n = " + n);
	   //결과는 5 인데, float에서 int로 캐스팅되면서 소수점 이하 자리를 상실함
	

}
