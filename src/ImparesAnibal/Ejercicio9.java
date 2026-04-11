package ImparesAnibal;

import Model.Producto;
import Util.Datos;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio9 {

    //9. Aplicar descuento
    //○ Crear una nueva lista de productos con un 15% de descuento en su precio,
    //pero solo si el producto tiene más de 20 unidades en stock.

    public static void ejecutar(){

        List<Producto> productosConDescuento = Datos.PRODUCTOS.stream()

                .map(p -> {
                    if(p.getStock()>20){
                        return new Producto(p.getNombre(), p.getPrecio()*.85, p.getCategoria(), p.getStock());


                    }
                    return p;
                })
                .toList();

        productosConDescuento.forEach(producto -> System.out.println(producto.getNombre()+" - "+producto.getPrecio()+" - Stock: "+producto.getStock()));



    }

    public static void main(String[] args) {
        ejecutar();
    }
}
