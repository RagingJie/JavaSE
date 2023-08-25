package String;

public enum number {
    BIG_YI(1,"壹"),
    BIG_ER(2,"贰"),
    BIG_SAN(3,"叁"),
    BIG_SI(4,"肆"),
    BIG_WU(5,"伍"),
    BIG_LIU(6,"陆"),
    BIG_QI(7,"柒"),
    BIG_BA(8,"捌"),
    BIG_JIU(9,"玖"),
    BIG_SHI(10,"拾");


    private final int code;
    private final String bigNum;

    number(int code,String bigNum) {
        this.code = code;
        this.bigNum = bigNum;
    }

    public int getCode() {
        return code;
    }

    public String getBigNum() {
        return bigNum;
    }
}
