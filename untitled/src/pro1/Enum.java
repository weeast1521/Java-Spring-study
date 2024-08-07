package pro1;

public enum Enum {
    START("숫자 야구 게임을 시작합니다."),
    FINISH("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    INPUT("숫자를 입력해주세요 : "),
    GAME_START_OR_FINISH("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
    ;

    private final String value;

    Enum(String value) {
        this.value = value;
    }
    public  String getValue(){
        return value;
    }
}