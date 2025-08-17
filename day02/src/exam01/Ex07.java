package day02.src.exam01;

public class Ex07 {
    public static void main(String[] args) {
        int num = 10;
        //int num2 = num++; // 대입먼저 발생 숫자가 10로 나타난다 num=11 , num2=10
        //int num2 = ++num; // 연산이 먼저 발생 둘다 11로 나타난다
        //int num2 = num--; // 대입이 먼저 발생 num=9 , num2 =10
        int num2 = --num; // 연산이 먼저 발생 num=9 , num2 =9
        System.out.println("num=" + num +", num2=" + num2);

        /* 구호가 앞에 있으면 연산이 먼저 발생한다*/

    }
}
