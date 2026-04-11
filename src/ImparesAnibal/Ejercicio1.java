package ImparesAnibal;

import Util.Datos;

import java.util.List;

public class Ejercicio1 {

    //1. Filtrado y Transformación
    //○ Obtener una lista con los nombres y precios de los productos de la categoría
    //"Electrónica" cuyo precio sea mayor a 1000, ordenados de mayor a menor
    //precio.

    public static void ejecutar(){

        List<String> resultado = Datos.PRODUCTOS.stream()
                .filter(p -> p.getCategoria().equals("Electrónica"))
                .filter(p -> p.getPrecio() > 1000)
                .sorted((p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio()))
                .map(p -> p.getNombre() + " - $" + p.getPrecio())
                .toList();

        System.out.println("Productos de la categoría 'Electrónica' con precio mayor a 1000, ordenados de mayor a menor precio: " + resultado);

    }

    public static void main(String[] args) {
        ejecutar();
    }
}
