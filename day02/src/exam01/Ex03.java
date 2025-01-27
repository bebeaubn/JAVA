package exam01;

public class Ex03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        System.out.println(num1 == num2);  // true
        // 같은 주소에 있는 자원 , 같은 위치에 있는 자원 , 상수는 값이 안변해 같은 주소라 판단 -> 리터럴 상수



        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // false
        System.out.println(str2.equals(str2)); // true

    }
}
