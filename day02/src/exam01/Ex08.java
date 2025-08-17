package day02.src.exam01;

public class Ex08 {
    public static void main(String[] args) {
        int num1 =10;
        boolean result = num1++ > 9 || (num1 = num1 + 10) > 30; // true 둘중 하나가 참
        System.out.println(result);
        System.out.println(num1); // 값이 11 로 나옴 이미 참이 판별되서 || 뒤 끊어버림 연산을 안함 --> 단락회로 평가
    }
}
