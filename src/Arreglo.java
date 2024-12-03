import java.util.Arrays;

public class Arreglo {
    public static void main(String[] args) {
        int[] arreglo = new int[100];
        
        for (int i = 0; i < 100; i++) {
            arreglo[i] = i + 1; 
        }

        System.out.println(Arrays.toString(arreglo)); 
    }
}
