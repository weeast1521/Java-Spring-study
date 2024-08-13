package pro1;

public class Result { // 이런 클래스는 어떤식으로 이름을 짓는게 좋은지..?
    private int strike = 0;
    private int ball = 0;
    private int gameSet = 0;

    public int getStrike() {
        return strike;
    }

    public void countIncreaseStrike() {
        strike ++ ;
    }

    public int getBall() {
        return ball;
    }

    public void countIncreaseBall() {
        ball ++;
    }
    public void resetBallStrike(){
        ball = 0;
        strike = 0;
    }
    public int getGameSet() {
        return gameSet;
    }

    public void setGameSet(int gameSet) {
        this.gameSet = gameSet;
    }
}
