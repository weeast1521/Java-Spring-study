package pro1.view;

public enum Message {
    GAME_START("숫자 야구 게임을 시작합니다."),
    GAME_FINISH("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    NUM_INPUT("숫자를 입력해주세요 : "),
    GAME_START_OR_FINISH("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    NOT_BALL_NOT_STRIKE("낫싱"),
    BALL_STRIKE("%d볼 %d스트라이크"),
    BALL("%d볼"),
    STRIKE("%d스트라이크")
    ;

    private final String value;

    Message(String value) {
        this.value = value;
    }
    public void print(){
        System.out.print(value);
    }
    public void println(){
        System.out.println(value);
    }
    public void printBall(int ball){
        System.out.printf(value, ball);
        System.out.println();
    }
    public void printStrike(int strike){
        System.out.printf(value, strike);
        System.out.println();
    }

    public void printBallAndStrike(int ball, int strike){
        System.out.printf(value, ball, strike);
        System.out.println();
    }
}