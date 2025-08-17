package day02.src.exam01;

public class Ex04 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = -num1;  // -10 -로 인해서 양수가 음수로 변경
        System.out.println(num2);

        int num3 = -num2;   // 10  -인해서 음수가 양수로 변환
        System.out.println(num3);
    }
}
