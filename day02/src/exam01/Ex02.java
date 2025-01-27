package exam01;

public class Ex02 {
    static int num5;
    static double num6;
    static boolean result;



    public static void main(String[] args) {

        System.out.println(num5);
        System.out.println(num6);
        System.out.println(result);



        int num1 = 10000;
        byte num2 = (byte) num1; //데이터 유실 발생
        System.out.println(num2);  // 값 16으로 나옴


        double num3 = 100.123;
        int num4 = (int)num3; // 데이터 유실 , 명시적으로 알려줘야함
        System.out.println(num4);  // 값 100으로 나옴
    }
}
