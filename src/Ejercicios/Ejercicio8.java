package Ejercicios;

import Util.Datos;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio8 {

    //8. Stock por Categoría
    //○ Calcular cuántas unidades en stock hay por categoría, excluyendo categorías
    //con menos de 3 productos.

    public static void ejecutar() {

        Map<String, Integer> resultado = Datos.PRODUCTOS.stream()
                .collect(Collectors.groupingBy(p ->p.getCategoria(),
                        Collectors.summingInt(p -> p.getStock())));
        
        resultado.entrySet().removeIf(e->e.getValue()<3);

        System.out.println("Stock por categoría (excluyendo categorías con menos de 3 productos): " + resultado);



    }
    public static void main(String[] args){
        ejecutar();
    }
}
