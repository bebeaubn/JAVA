package day02.src.exam01;

// switch - case
public class Ex12 {
    public static void main(String[] args) {
        int rank = 1;
        switch (rank){
            case 1:
                System.out.println("금메달!");
                break;
            case  2:
                System.out.println("은메달!");
                break;
            case 3:
                System.out.println("동메달!");
                break;
            default:
                System.out.println("입상"); // rank가 없을때 defalt 사용
        }
    } // 금메달 , 은메달 , 동메달 다 나옴 break;를 걸어 내가 나오게 하고 싶은 실행결과 아래에 넣어주기
      // break를 만나기 전까지 실행됨
}
