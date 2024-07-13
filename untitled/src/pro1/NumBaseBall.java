package pro1;

import java.util.Random;
import java.util.Scanner;

public class NumBaseBall {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int rdNum[] = new int[3];
    int inputNum[] = new int[3];
    boolean check = false;
    public void setRdNum() {
        for(int i=0; i<3; i++){ //랜덤수 생성
            rdNum[i] = rd.nextInt(9) + 1;
            for(int j=0; j<i; j++){
                if(rdNum[i] == rdNum[j]){
                    i--;
                }
            }
        }
    }

    public void setInputNum(){
        check = false;
        System.out.print("숫자를 입력해주세요 : ");
        int tmp = sc.nextInt();

        inputNum[0] = tmp / 100;
        tmp = tmp - inputNum[0]*100;
        inputNum[1] = tmp / 10;
        tmp = tmp - inputNum[1]*10;
        inputNum[2] = tmp;

        for(int i=0; i<3; i++){
            for(int j=0; j<i; j++){
                if(inputNum[i] == inputNum[j]){
                    throw new IllegalArgumentException(); //이거 무슨 역할이지?
                }
            }
        }
    }

    public void check(){
        int strike = 0;
        int ball = 0;

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(rdNum[i] == inputNum[j]){
                    if(i==j){
                        strike = strike + 1;
                    }
                    else{
                        ball = ball + 1;
                    }
                }
            }
        }
        if (strike == 0 && ball == 0){
            System.out.println("낫싱");
        }
        else if(strike == 0 && ball > 0){
            System.out.println(ball+"볼");
        }
        else if(strike > 0 && ball == 0){
            System.out.println(strike+"스트라이크");
        }
        else{
            System.out.println(ball + "볼" + " " + strike + "스트라이크");
        }
        if (strike == 3){
            check = true;
        }
    }
}
