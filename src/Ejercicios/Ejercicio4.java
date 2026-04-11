package Ejercicios;

import Util.Datos;

import java.util.Optional;

public class Ejercicio4 {

    //4. Uso de Optionals
    //○ Encontrar el producto de la categoría "Deportes" con stock mayor a 10
    //unidades, obtener su nombre en minúsculas y devolverlo dentro de un
    //Optional. Mostrarlo o si no existe, mostrar “Producto Inexistente”

    public static void ejecutar() {

        Optional<String> resultado = Datos.PRODUCTOS.stream()
                .filter(p -> p.getCategoria().equals("Deportes"))
                .filter(p -> p.getStock() > 10)
                .map(p -> p.getNombre().toLowerCase())
                .findFirst();



        System.out.println("Producto encontrado: " + resultado.orElse("Producto Inexistente"));

    }
    public static void main(String[] args){
        ejecutar();
    }

}
