package day02.src.exam01;

public class Ex02 {

    static int  num5; // 변수만 선언해도 기본값 0 들어가 있음
    static double num6; //변수만 선언해도 기본값 0.0 들어가 있음
    static boolean result; //변수만 선언해도 기본값 false 들어가 있음

    public static void main(String[] args) {

        System.out.println(num5);
        System.out.println(num6);
        System.out.println(result);

        int num1 = 100;
        byte num2 = (byte)num1;
        System.out.println(num2); // 16 이유는 데이터 유실이 되어서 16이 나옴

        double num3 = 100.123;
        int num4 = (int)num3; // 명시적으로 알려줘야함
        System.out.println(num4); //100이 나옴

    }
}
