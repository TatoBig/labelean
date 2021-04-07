public class NodoInterno {
    private Integer valorInt;
    private String valorString;
    private Boolean valorBoolean;
    private Double valorDouble;
    private Float valorFloat;
    private Integer type;

    public NodoInterno(Integer valorInt) {
        this.valorInt = valorInt;
        this.type = 1;
    }
    public NodoInterno(String valorString) {
        this.valorString = valorString;
        this.type = 2;
    }
    public NodoInterno(Boolean valorBoolean) {
        this.valorBoolean = valorBoolean;
        this.type = 3;
    }
    public NodoInterno(Double valorDouble) {
        this.valorDouble = valorDouble;
        this.type = 4;
    }
    public NodoInterno(Float valorFloat) {
        this.valorFloat = valorFloat;
        this.type = 5;
    }
    public Integer getType() {
        return type;
    }

    public Integer getValorInt() {
        return valorInt;
    }

    public String getValorString() {
        return valorString;
    }

    public Boolean getValorBoolean() {
        return valorBoolean;
    }

    public Double getValorDouble() {
        return valorDouble;
    }

    public Float getValorFloat() {
        return valorFloat;
    }
}
