package pro1.controller;

import pro1.model.RandomNumber;
import pro1.model.GameModel;
import pro1.model.UserInputNumber;
import pro1.view.Message;

public class StrikeAndBallCheck {
    GameModel gameModel = new GameModel();
    UserInputNumber userInputNumber;
    RandomNumber randomNumber;
//    int[] randNum = new int[3];
//    int[] inputNum = new int[3];

    // gameModel 객체 생성을 해서 사용하면 모델과 커뮤니케이션을 하는것임, randNum inputNum 같은 것도 모델로 들어가게된다 매개변수로 받는것도 x
    public StrikeAndBallCheck(RandomNumber randomNumber, UserInputNumber userInputNumber) {
        this.randomNumber = randomNumber;
        this.userInputNumber = userInputNumber;
    }
    public void checkStrike(int i, int j){
        if(randomNumber.getRandNum()[i] == userInputNumber.getInputNum()[j] && i == j){
            gameModel.increaseStrike();
        }
    }
    public void checkBall(int i, int j) {
        if (randomNumber.getRandNum()[i] == userInputNumber.getInputNum()[j] && i != j) {
            gameModel.increaseBall();
        }
    }

    public boolean checkStrikeAndBall(){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                checkStrike(i, j);
                checkBall(i, j);
            }
        }
        if (gameModel.getStrike() == 0 && gameModel.getBall() == 0){
            Message.NOT_BALL_NOT_STRIKE.println();
        }
        else if(gameModel.getStrike() == 0 && gameModel.getBall() > 0){
            Message.BALL.printBall(gameModel.getBall());
        }
        else if(gameModel.getStrike() > 0 && gameModel.getBall() == 0){
            Message.STRIKE.printStrike(gameModel.getStrike());
        }
        else{
            Message.BALL_STRIKE.printBallAndStrike(gameModel.getBall(), gameModel.getStrike());
        }
        // printStrikeAndBallCount.printStrikeAndBallCount(strike, ball);
        // PrintStrikeAndBallCount 클래스를 남기는게 좋은지 아니면 Message 로 넘기는게 좋은지
        if (gameModel.getStrike() == 3){
            gameModel.resetBallStrike();
            return true;
        }
        else{
            gameModel.resetBallStrike();
            return false;
        }
    }
}
