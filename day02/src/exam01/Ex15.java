package day02.src.exam01;

// for
public class Ex15 {
    public static void main(String[] args) {

        int total = 0;

        for (int i = 1; i <= 100; i++) {
            if(i %2 == 0){
                continue;
            }

            total += i;
          /**  if (num % 2 == 1) { // 홀수 구하기
                total += num;
                    /*
                       if(num == 50) {
                           break; // 1275
                       }

            }
        */
            System.out.println(total);
        }
    }
}