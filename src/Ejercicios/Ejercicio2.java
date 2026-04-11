package Ejercicios;

import Util.Datos;

import java.util.Scanner;

public class Ejercicio2 {

    public static void ejecutar() {
        //2. Reducción de Datos
        //○ Calcular el precio promedio de los productos de la categoría "Hogar", pero
        //solo considerando aquellos con stock disponible.

        double promedio = Datos.PRODUCTOS.stream()
                .filter(p -> p.getCategoria().equals("Hogar"))
                .filter(p -> p.getStock() > 0)
                .mapToDouble(p -> p.getPrecio())
                .average()
                .orElse(0);

        System.out.println("El precio promedio de los productos de la categoría 'Hogar' con stock disponible es: " + promedio);
    }
        public static void main(String[] args){
            ejecutar();
        }

    }

