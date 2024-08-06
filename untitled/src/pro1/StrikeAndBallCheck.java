package pro1;

public class StrikeAndBallCheck {
    PrintStrikeAndBallCount printStrikeAndBallCount = new PrintStrikeAndBallCount();
    SetRandomNumber setRandomNumber = new SetRandomNumber();
    SetInputNumber setInputNumber = new SetInputNumber();
    public int strikeCheck(int i, int j, int strikeNum){
        if(setRandomNumber.randNum[i] == setInputNumber.inputNum[j] && i == j){
            return strikeNum+1;
        }
        else{
            return strikeNum;
        }
    }
    public int ballCheck(int i, int j, int ballNum) {
        if (setRandomNumber.randNum[i] == setInputNumber.inputNum[j] && i != j) {
            return ballNum + 1;
        }
        else{
            return ballNum;
        }
    }

    public boolean checkStrikeAndBall(){
        int strike = 0;
        int ball = 0;

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                strike = strikeCheck(i, j, strike);
                ball = ballCheck(i, j, ball);
            }
        }
        printStrikeAndBallCount.printStrikeAndBallCount(strike, ball);
        return strike == 3;
    }
}
