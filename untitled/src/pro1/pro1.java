package pro1;

import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SetRandomNumber setRandomNumber = new SetRandomNumber();
        SetInputNumber setInputNumber = new SetInputNumber();
        StrikeAndBallCheck strikeAndBallCheck = new StrikeAndBallCheck();

        System.out.println(Enum.START.getValue());

        while(true){
            setRandomNumber.setRandNum();

            while(true){
                setInputNumber.setInputNum();

                if (strikeAndBallCheck.checkStrikeAndBall()){
                    System.out.println(Enum.FINISH.getValue());
                    System.out.println(Enum.GAME_START_OR_FINISH.getValue());
                    break;
                }
            }

            int gameSet = sc.nextInt();
            if (gameSet == 2){
                break;
            }
        }
    }
}