public class Nodo {
    private NodoInterno nodoInterno;
    private Nodo nodoSiguiente;

    public Nodo(Integer valorInt) {
        nodoInterno = new NodoInterno(valorInt);
    }
    public Nodo(String valorString, Nodo nodoSiguiente) {
        nodoInterno = new NodoInterno(valorString);
        this.nodoSiguiente = nodoSiguiente;
    }
    public Nodo(Boolean valorBoolean, Nodo nodoSiguiente) {
        nodoInterno = new NodoInterno(valorBoolean);
        this.nodoSiguiente = nodoSiguiente;
    }
    public Nodo(Double valorDouble, Nodo nodoSiguiente) {
        nodoInterno = new NodoInterno(valorDouble);
        this.nodoSiguiente = nodoSiguiente;
    }
    public Nodo(Float valorFloat, Nodo nodoSiguiente) {
        nodoInterno = new NodoInterno(valorFloat);
        this.nodoSiguiente = nodoSiguiente;
    }
}
