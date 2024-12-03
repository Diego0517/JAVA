import java.util.*;

public class OperacionesArreglo {
    public static int SumaDeValores(int[] arreglo) {
        int suma = 0;
        for (int i : arreglo) {
            suma = suma + 1;
        }
        return suma;
    }

    public static int ValoresUnicos(Object[] arreglo) {
        ArrayList<Object> arreglito = new ArrayList<>();
        for (Object o : arreglo){
            if (!arreglito.contains(o)){
                arreglito.add(o);
            }
        }
 return arreglito.size();
    }

    
}
