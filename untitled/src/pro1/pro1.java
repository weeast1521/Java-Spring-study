package pro1;

import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumBaseBall numBaseBall = new NumBaseBall();
        boolean check = false;

        System.out.println("숫자 야구 게임을 시작합니다.");
        while(true){
            numBaseBall.setRdNum();

            while(true){
                numBaseBall.setInputNum();
                numBaseBall.check();
                if (numBaseBall.check){
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    break;
                }
            }
            int tmp = sc.nextInt();
            if (tmp == 2){
                break;
            }
        }
    }
}



// 105 - 스위치케이스 , 487 예외