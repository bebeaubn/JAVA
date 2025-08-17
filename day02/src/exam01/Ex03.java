package day02.src.exam01;

public class Ex03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        System.out.println(num1 == num2);  // true
        // 같은 주소에 있는 자원 , 같은 위치에 있는 자원 , 상수는 값이 안변해 같은 주소라 판단 -> 리터럴 상수
        // 상수는 변하지 않기때문에 동일성 비교 (==) 해도 true 나옴



        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // false -> 동일하지 않은 객체여서
        System.out.println(str2.equals(str2)); // true -> 값에 동일성을 넣으면 true로 나옴


    }
}
