package ImparesAnibal;

import Model.Producto;
import Util.Datos;

import java.util.Comparator;
import java.util.List;

public class Ejercicio5 {

    //5. Producto Mas Barato
    //○ Encontrar el producto mas barato calculando el valor total de todas las
    //unidades en stock (Precio * stock). Devolver un Opcional con el producto. En
    //caso de que no exista, lanzar una excepción.

    public static void ejecutar(){

        List<Producto> productos = Datos.PRODUCTOS;

        Producto productoMasBarato = productos.stream()
                .min(Comparator.comparingDouble(p -> p.getPrecio() * p.getStock()))
                .orElseThrow(() -> new RuntimeException("No se encontró ningún producto"));

        double valorTotal = productoMasBarato.getPrecio() * productoMasBarato.getStock();

        System.out.println("Producto más barato: " + productoMasBarato.getNombre() + " - Valor total en stock: $" + valorTotal);


    }

    public static void main(String[] args) {
        ejecutar();
    }
}
