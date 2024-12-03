public class Objeto {
    public static void main(String[] args) {
        Object[] arreglo = {
            10.55, true, "Lunes", 5.5f, 45, "f",
        };

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice " + i + " tiene un tipo de dato: " + arreglo[i].getClass().getSimpleName());

    }
 }
}