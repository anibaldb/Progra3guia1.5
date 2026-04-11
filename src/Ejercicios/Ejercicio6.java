package Ejercicios;

import Util.Datos;

import java.util.List;
import java.util.Optional;

public class Ejercicio6 {

    //6. Productos en stock ordenados alfabéticamente
    //○ Obtener una lista con los nombres de los productos que tienen stock,
    //ordenarlos alfabéticamente y excluir los productos con nombres de menos de
    //5 caracteres.

    public static void ejecutar() {

        List<String> productosEnStock = Datos.PRODUCTOS.stream()
                .filter(p -> p.getStock() > 0)
                .map(p -> p.getNombre())
                .filter(nombre -> nombre.length() >= 5)
                .sorted()
                .toList();


        System.out.println("Productos en stock ordenados alfabéticamente: " + productosEnStock);

    }
    public static void main(String[] args){
        ejecutar();
    }
}
