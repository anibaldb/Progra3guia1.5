package ImparesAnibal;

import Util.Datos;

public class Ejercicio7 {

    //7. Calculo de Stock Total
    //○ Obtener el total de unidades en stock de todos los productos, pero solo
    //considerando aquellos con precio superior al promedio.

    public static void ejecutar(){

        double promedio = Datos.PRODUCTOS.stream()
                .mapToDouble(p -> p.getPrecio())
                .average()
                .orElse(0);

        int total = Datos.PRODUCTOS.stream()
                .filter(p->p.getPrecio() > promedio)
                .mapToInt(p -> p.getStock())
                .sum();

        System.out.println("Total de unidades en stock de productos con precio superior al promedio: " + total);



    }

    public static void main(String[] args) {
        ejecutar();
    }
}
