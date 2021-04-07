import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<NodoInterno> arreglo = new ArrayList<>();
        NodoInterno nodoInt = new NodoInterno(130);
        NodoInterno nodoString = new NodoInterno("String");
        NodoInterno nodoBoolean = new NodoInterno(true);
        NodoInterno nodoDouble = new NodoInterno(30131.2023);
        NodoInterno nodoFloat = new NodoInterno(8183412.393F);

        arreglo.add(nodoInt);
        arreglo.add(nodoString);
        arreglo.add(nodoBoolean);
        arreglo.add(nodoDouble);
        arreglo.add(nodoFloat);

        System.out.print("[ ");
        for (NodoInterno var : arreglo){

            switch(var.getType()){
                case 1:
                    System.out.print(var.getValorInt() + ", ");
                    break;
                case 2:
                    System.out.print(var.getValorString() + ", ");
                    break;
                case 3:
                    System.out.print(var.getValorBoolean() + ", ");
                    break;
                case 4:
                    System.out.print(var.getValorDouble() + ", ");
                    break;
                case 5:
                    System.out.print(var.getValorFloat() + ", ");
                    break;
                default:
                    break;
            }
        }
        System.out.println(" ]");
    }
}
