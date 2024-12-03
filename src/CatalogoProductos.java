import java.util.ArrayList;
import java.util.List;

class Producto {
    private int id;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{id=" + id + ", nombre='" + nombre + "', precio=" + precio + "}";
    }
}

public class CatalogoProductos {
    private List<Producto> productos;

    // Constructor que inicializa el catálogo con algunos productos
    public CatalogoProductos() {
        productos = new ArrayList<>();
        productos.add(new Producto(2, "Producto A", 150.50));
        productos.add(new Producto(3, "Producto B", 200.75));
        productos.add(new Producto(4, "Producto C", 99.99));
        // Agregar más productos según sea necesario
    }

    // Método obtenerProductoPorId
    public Producto obtenerProductoPorId(int id) {
        if (id < 2 || id > 200) {
            throw new IllegalArgumentException("El ID debe estar entre 2 y 200.");
        }

        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }

        return null; // Si no se encuentra el producto
    }

    public static void main(String[] args) {
        CatalogoProductos catalogo = new CatalogoProductos();

        try {
            Producto producto = catalogo.obtenerProductoPorId(3);
            System.out.println(producto != null ? producto : "Producto no encontrado");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
