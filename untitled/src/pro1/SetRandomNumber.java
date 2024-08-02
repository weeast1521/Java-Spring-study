package pro1;

import java.util.Random;

public class SetRandomNumber {
    Random rd = new Random();
    int randNum[] = new int[3];
    public void setRandNum() {
        randNum[0] = -1;
        randNum[1] = -1;
        randNum[2] = -1;

        for(int i=0; i<3; i++){ //랜덤수 생성
            randNum[i] = rd.nextInt(9) + 1;
            for(int j=0; j<i; j++){
                if(randNum[i] == randNum[j]){
                    i--;
                }
            }
        }
    }
}
