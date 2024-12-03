package RickAndMorty;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class ImagenDesdeURL {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Imagen desde URL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        try {
            Scanner var = new Scanner(System.in);
            int Id = var.nextInt();
            Character Character = ApiUtil.getCharacterById(Id);
            System.out.println("Nombre: " + Character.name);
            System.out.println("Estado: " + Character.status);
            // Imprimir más datos según sea necesario
            // URL de la imagen
            Character character = ApiUtil.getCharacterById(Id);
            @SuppressWarnings("deprecation")
            URL url = new URL(Character.getImage());
            // Cargar la imagen desde la URL
            Image imagen = ImageIO.read(url);

            // Crear un JLabel para mostrar la imagen
            JLabel etiquetaImagen = new JLabel(new ImageIcon(imagen));
            frame.add(etiquetaImagen);

        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }
}