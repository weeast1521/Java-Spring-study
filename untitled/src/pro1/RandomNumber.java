package pro1;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    //멤버변수
    int[] randNum = new int[3];

    Random rd = new Random();

    public void setRandNum() {

        //람다식을 통해서 3개의 값을 바꿔주는 역할
//        for(int i=0; i<3; i++){ //랜덤수 생성
//            randNum[i] = rd.nextInt(9) + 1;
//            for(int j=0; j<i; j++){
//                if(randNum[i] == randNum[j]){
//                    i--;
//                }
//            }
//        }
        // arr 초기화를 하나하나 시키지 말고 그냥 한번에 수 3개를 받아서 중복이 있으면 다시하는 걸로 바꾸면 코드가 더 깔끔해지네
        do{
            Arrays.setAll(randNum, (i) -> (rd.nextInt(9)+1)); //랜덤수 3개를 넣음
        } while(checkDuplication());

    }

    public boolean checkDuplication() {//중복이 들어갔는지에 대한 검사 함수
        return randNum[0] == randNum[1] || randNum[0] == randNum[2] || randNum[1] == randNum[2];
    }
}
