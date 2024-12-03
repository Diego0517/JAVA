import java.util.Arrays;
public class Persona {
    String nombre;
    int edad;
    public String toString() {
        return nombre + " - " + edad;
    }
    public static void main(String[] args) {
       Persona p1= new Persona();
       p1.nombre="Diego";
       p1.edad=18;

       Persona p2= new Persona();
       p2.nombre="Armando";
       p2.edad=17;

       Persona[] personas={p1,p2};

       System.err.println(Arrays.toString(personas));

    }  
}
