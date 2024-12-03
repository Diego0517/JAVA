import java.util.Arrays;

public class Burbuja {
   public static void main(String[] args) {
    int[] arreglo = {4, 8, 5, 1};
    System.out.println(Arrays.toString(arreglo));
    int temp;
    for (int i=0; i < arreglo.length - 1; i++)
    {
        for(int j = 1 + 1 ; j < arreglo.length; j++)
        {
           // System.out.println("Valores> i: " + i + " j: " + j);
           if(arreglo[i] > arreglo[j])
           {
            temp = arreglo [i];
            arreglo [i] = arreglo [j];
            arreglo [j] = temp;
           }
           
        }
    }
    System.out.println(Arrays.toString(arreglo));
    System.out.println("FIN!!");
   } 
}
