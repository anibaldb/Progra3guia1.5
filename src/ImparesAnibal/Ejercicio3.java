package ImparesAnibal;

import Model.Producto;
import Util.Datos;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio3 {

    //3. Producto mas caro
    //○ Obtener el producto más caro de cada categoría y devolver un mapa con la
    //categoría como clave y el producto más caro como valor.


    public static void ejecutar(){

        Map<String, Optional<Producto>> resultado = Datos.PRODUCTOS.stream()
                .collect(Collectors.groupingBy(p ->p.getCategoria(),
                        Collectors.maxBy(Comparator.comparingDouble(Producto::getPrecio))));

        resultado.forEach((p,p1)-> System.out.println("Categoría: " + p + ", Producto más caro: " + p1.map(pro->pro.getNombre()).orElse("Producto Inexistente")));



        }





    public static void main(String[] args) {
        ejecutar();
    }
}
