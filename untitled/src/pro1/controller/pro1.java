package pro1.controller;

import pro1.model.UserInputNumber;
import pro1.model.RandomNumber;
import pro1.model.Result;
import pro1.view.Message;
import pro1.view.StrikeAndBallCheck;

import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomNumber setRandomNumber = new RandomNumber();
        UserInputNumber UserInputNumber = new UserInputNumber();
        StrikeAndBallCheck strikeAndBallCheck = new StrikeAndBallCheck();
        Result result = new Result();

        Message.GAME_START.print();

        while(result.getGameSet() != 2){
            setRandomNumber.setRandNum();

            while(true){
                UserInputNumber.setInputNum();

                if (strikeAndBallCheck.checkStrikeAndBall(setRandomNumber.getRandNum(), UserInputNumber.getInputNum())){
                    Message.GAME_FINISH.println();
                    Message.GAME_START_OR_FINISH.println();
                    break;
                }
            }

            result.setGameSet(sc.nextInt());
        }
    }
}