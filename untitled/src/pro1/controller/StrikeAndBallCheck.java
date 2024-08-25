package pro1.view;

import pro1.model.Result;
import pro1.view.Message;

public class StrikeAndBallCheck {
    // PrintStrikeAndBallCount printStrikeAndBallCount = new PrintStrikeAndBallCount();
    Result result = new Result();
    int[] randNum = new int[3];
    int[] inputNum = new int[3];

    // result 객체 생성을 해서 사용하면 모델과 커뮤니케이션을 하는것임, randNum inputNum 같은 것도 모델로 들어가게된다 매개변수로 받는것도 x

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
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if i == j &&
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
