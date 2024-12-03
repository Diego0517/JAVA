package Aplicacion;

import Modulos.Leer;

public class App {
    public static void main(String[] args) {
        Leer leer = new Leer();
        String texto = leer.LeerTexto();
        System.out.println("Escribiste " + texto);
        int numero = leer.LeerNumeroEntero();
        System.out.println("Escribiste el numero " + numero);


    }
}
