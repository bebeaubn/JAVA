package day02.src.exam01;

// while 문
public class Ex13 {
    public static void main(String[] args) {
        int num = 1 , total = 0;  //같은 자료형일때 변수 동시 선언 가능

        while (num <= 100){
            total += num;
            num++;
        }
        System.out.println(total);  // total = 5050

        // 초기값 (int num =1) , 조건식(num <= 100) , 증감식 (num ++)  --> 횟수에 통제가 가능
    }
}
