package pro1.model;

public class Result { // 이런 클래스는 어떤식으로 이름을 짓는게 좋은지..?
    private int strike = 0;
    private int ball = 0;
    private int gameSet = 0;

    public int getStrike() {
        return strike;
    }

    public void increaseStrike() {
        strike ++ ;
    } //모델 안에서 그 모델 매개변수를 변경시키는 건 ㄱㅊㄱㅊ

    public int getBall() {
        return ball;
    }

    public void increaseBall() {
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
