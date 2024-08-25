package pro1.controller;

import pro1.model.RandomNumber;
import pro1.model.UserInputNumber;
import pro1.view.GameView;
import pro1.view.Message;

public class GameController {
    RandomNumber randomNumber = new RandomNumber();
    UserInputNumber userInputNumber = new UserInputNumber();
    StrikeAndBallCheck strikeAndBallCheck = new StrikeAndBallCheck(randomNumber, userInputNumber);
    GameView gameView = new GameView();
    public void runBaseBallGame() {
        Message.GAME_START.println();

        do{
            randomNumber.setRandNum();

            while(true){
                userInputNumber.setInputNum();

                if (strikeAndBallCheck.checkStrikeAndBall()){
                    Message.GAME_FINISH.println();
                    Message.GAME_START_OR_FINISH.println();
                    break;
                }
            }
        }while(gameView.getGameSet() != 2);
    }
}
