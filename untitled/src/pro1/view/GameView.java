package pro1.view;

import java.util.Scanner;

public class GameView {
    Scanner sc = new Scanner(System.in);

    public int getGameSet(){
        return sc.nextInt();
    }

    public void printStrikeAndBallCount(int strike, int ball){
        if (strike == 0 && ball == 0){
            Message.NOT_BALL_NOT_STRIKE.println();
        }
        else if(strike == 0 && ball > 0){
            Message.BALL.printBall(ball);
        }
        else if(strike > 0 && ball == 0){
            Message.STRIKE.printStrike(strike);
        }
        else{
            Message.BALL_STRIKE.printBallAndStrike(ball, strike);
        }
    }
}
