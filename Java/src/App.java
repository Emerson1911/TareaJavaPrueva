import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Producto> producto = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el ID del producto:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la marca del producto:");
            String marca = scanner.nextLine();
            System.out.println("Ingrese el precio del producto:");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            Producto productos = new Producto(id, nombre, marca, precio);
            producto.add(productos);

            System.out.println("¿Desea agregar otro producto? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                break; // Sale del bucle
            }

        }

        Collections.sort(producto, Comparator.comparingInt(Producto::getId));
        Iterator<Producto> iterator = producto.iterator();
        while (iterator.hasNext()) {
            Producto productoActual = iterator.next();
            System.out.println("ID: " + productoActual.getId() +
                    ", Nombre: " + productoActual.getNombre() +
                    ", Marca: " + productoActual.getMarca() +
                    ", Precio: " + productoActual.getPrecio());
        }
        scanner.close();
    }
}
