package MyLambda;

public enum CalculateType {

    ADD("+"),
    SUB("-"),
    MULTI("*"),
    DIV("/")
    ;

    private String type;
    CalculateType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
