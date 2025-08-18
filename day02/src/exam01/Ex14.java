package day02.src.exam01;

// do ~ while
public class Ex14 {
    public static void main(String[] args) {
        int num = 1, total = 0;

        do {
            total += num;
            num++;
        } while (num <= 100); // 조건식이 나중에 들어가 무조건 한번 실행됨

        System.out.println(total);
    }
}
