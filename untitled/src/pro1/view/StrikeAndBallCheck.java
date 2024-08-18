package pro1;

import pro1.model.Result;

public class StrikeAndBallCheck {
    // PrintStrikeAndBallCount printStrikeAndBallCount = new PrintStrikeAndBallCount();
    Result result = new Result();
    int[] randNum = new int[3];
    int[] inputNum = new int[3];

    public void strikeCheck(int i, int j){
        if(randNum[i] == inputNum[j] && i == j){
            result.countIncreaseStrike();
        }
    }
    public void ballCheck(int i, int j) {
        if (randNum[i] == inputNum[j] && i != j) {
            result.countIncreaseBall();
        }
    }

    public boolean checkStrikeAndBall(int[] randNum, int[] inputNum){
        this.randNum = randNum;
        this.inputNum = inputNum;

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                strikeCheck(i, j);
                ballCheck(i, j);
            }
        }
        if (result.getStrike() == 0 && result.getBall() == 0){
            Message.NOT_BALL_NOT_STRIKE.println();
        }
        else if(result.getStrike() == 0 && result.getBall() > 0){
            Message.BALL.printBall(result.getBall());
        }
        else if(result.getStrike() > 0 && result.getBall() == 0){
            Message.STRIKE.printStrike(result.getStrike());
        }
        else{
            Message.BALL_STRIKE.printBallAndStrike(result.getBall(), result.getStrike());
        }
        // printStrikeAndBallCount.printStrikeAndBallCount(strike, ball);
        // PrintStrikeAndBallCount 클래스를 남기는게 좋은지 아니면 Message 로 넘기는게 좋은지
        if (result.getStrike() == 3){
            result.resetBallStrike();
            return true;
        }
        else{
            result.resetBallStrike();
            return false;
        }
    }
}
