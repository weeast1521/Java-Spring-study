package pro1.model;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumber {
    //멤버변수
    private final int[] randNum = new int[3];

    Random rd = new Random();

    public int[] getRandNum(){
        return this.randNum;
    }
    public void setRandNum() {
        //람다식을 통해서 3개의 값을 바꿔주는 역할
//        do{
//            Arrays.setAll(randNum, (i) -> (rd.nextInt(9)+1)); //랜덤수 3개를 넣음
//        } while(checkDuplication());
        do {
            int[] newNumbers = IntStream.generate(() -> rd.nextInt(9) + 1)
                    .distinct()   // 중복된 숫자를 제거
                    .limit(3)     // 3개의 숫자만 생성
                    .toArray();   // 배열로 변환

            IntStream.range(0, 3).forEach(i -> randNum[i] = newNumbers[i]);
        } while (checkDuplication());
    }

    public boolean checkDuplication() {//중복이 들어갔는지에 대한 검사 함수
        // return randNum[0] == randNum[1] || randNum[0] == randNum[2] || randNum[1] == randNum[2];
        return Arrays.stream(randNum)       // randNum 배열을 스트림으로 변환
                .distinct()                 // 중복을 제거
                .count() != randNum.length;
    }
}