package day01;

public class 여러가지형태의데이터출력 {
	public static void main(String[] args) {
	    //한줄 주석 : //
	    /*
	    여
	    러
	    줄
	    주
	    석
	    */
	    //주석을 사용하는 이유 : 코드에 설명을 달아주기 위해
	    //sysout 적고 ctrl + spacebar 자동완성
	System.out.println("hello world");
	System.out.println(100);
	System.out.println(100+50);
	
	//문장뒤에 숫자를 더하면 문장 뒤에 붙는구나
	System.out.println("안녕하세요"+10);
	
	//코드는 항상 위에서 아래로, 좌에서 우로 진행이 되기 때문에 15:15가 나옵니다.
	System.out.println(5+10+":"+(5+10));
	
	// "2 + 2 = "가 숫자 처럼 보이지만 ""안에 묶여있으면 문장 취급을 받고
	//문장에 숫자를 더했기 때문에 22가 됩니다.
	System.out.println("2 + 2 = " + 2 + 2);
	System.out.println("2 + 2 = " + (2 + 2));	 
}
}

