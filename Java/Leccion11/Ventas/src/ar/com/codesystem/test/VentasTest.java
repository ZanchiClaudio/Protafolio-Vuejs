
package ar.com.codesystem.test;

import ar.com.codesystem.ventas.*;


public class VentasTest {
    public static void main(String[] args) {
        //creamos objetos de tipo Producto
        Producto producto1 = new Producto("Pantalon", 9500.0);
        Producto producto2 = new Producto("Campera", 29900.0);
        //mas productos de tarea
        Producto producto3 = new Producto("Zapatilla", 35000.0);
        Producto producto4 = new Producto("Boxer", 8000.0);
        Producto producto5 = new Producto("Media", 3000.0);
        Producto producto6 = new Producto("Remera", 15000.0);
        Producto producto7 = new Producto("Buzo", 30000.0);
        Producto producto8 = new Producto("Chaleco", 25100.0);
        Producto producto9 = new Producto("Camisa", 16000.0);
        Producto producto10 = new Producto("Ojotas", 25350.0);
        Producto producto11 = new Producto("Mochila", 70200.0);
        Producto producto12 = new Producto("Chalina", 11500.0);
        
        Orden orden1 = new Orden();
        //Agregamos productos a la lista
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        //mostramos la orden
        orden1.mostrarOrden();
        
        //Tarea: Crear mas objetos de tipo Producto (10) y crear mas objetos tipo Orden (2)
        
        //Orden2. Llenado de productos
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto10);
        orden2.agregarProducto(producto8);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto12);
        //mostramos Orden2
        orden2.mostrarOrden();
        
        //Orden3. Llenado de productos, mas de 10 productos
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto3);
        orden3.agregarProducto(producto11);
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto2);
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto11);
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto4);
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto6);
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto10);
        
        //mostramos Orden3
        orden3.mostrarOrden();
        
    }
}
