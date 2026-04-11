package Ejercicios;

import Util.Datos;
import org.w3c.dom.ls.LSOutput;

public class Ejercicio10 {

    //10. Ganancia total inventario
    //○ Calcular la ganancia total si se vendiera todo el inventario, considerando que
    //el costo de compra de cada producto es un 45% del valor de venta o de un
    //65% si pertenece a la categoria Electronica.



    public static void ejecutar() {

        double totalInventario= Datos.PRODUCTOS.stream()
                .mapToDouble(p-> {
                    double costo = p.getCategoria().equals("Electronica") ? 0.65 : 0.45;
                    double ganacia = p.getPrecio() * (1 - costo);
                    return ganacia * p.getStock();
                })
                .sum();

        System.out.println("La ganancia total si se vendiera todo el inventario es: " + totalInventario);

    }

    public static void main(String[] args) {
        ejecutar();
    }






}
