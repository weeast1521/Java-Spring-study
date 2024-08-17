package pro1;

import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomNumber setRandomNumber = new RandomNumber();
        InputNumber InputNumber = new InputNumber();
        StrikeAndBallCheck strikeAndBallCheck = new StrikeAndBallCheck();
        Result result = new Result();

        Message.GAME_START.print();

        while(result.getGameSet() != 2){
            setRandomNumber.setRandNum();

            while(true){
                InputNumber.setInputNum();

                if (strikeAndBallCheck.checkStrikeAndBall(setRandomNumber.randNum, InputNumber.inputNum)){
                    Message.GAME_FINISH.println();
                    Message.GAME_START_OR_FINISH.println();
                    break;
                }
            }

            result.setGameSet(sc.nextInt());
        }
    }
}