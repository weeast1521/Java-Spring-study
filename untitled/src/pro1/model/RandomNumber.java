package pro1.model;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    //멤버변수
    private final int[] randNum = new int[3];

    Random rd = new Random();

    public int[] getRandNum(){
        return this.randNum;
    }
    public void setRandNum() {
        //람다식을 통해서 3개의 값을 바꿔주는 역할
        do{
            Arrays.setAll(randNum, (i) -> (rd.nextInt(9)+1)); //랜덤수 3개를 넣음
        } while(checkDuplication());

    }

    public boolean checkDuplication() {//중복이 들어갔는지에 대한 검사 함수
        return randNum[0] == randNum[1] || randNum[0] == randNum[2] || randNum[1] == randNum[2];
    }
}
