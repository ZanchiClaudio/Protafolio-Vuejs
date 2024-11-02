from Orden import Orden
from Producto import Producto

producto1 = Producto('Camiseta', 100.00)
producto2 = Producto('Pantalon', 150.00)
producto3 = Producto('Pollera', 90.00) #nuevos productos
producto4 = Producto('Camisa', 175.00)
producto5 = Producto('Zapatilla', 200.00)
producto6 = Producto('Campera', 350.00)

productos1 = [producto1,producto2] #lista de productos
orden1 = Orden(productos1) #Primer objeto orden pasando la lista de productos
orden1.agregar_producto(producto5)
orden1.agregar_producto(producto3)
print(orden1)
print(f'Total de la orden1: {orden1.calcular_total()}')
productos2 = [producto3, producto4, producto5, producto6]  # nueva lista de productos
orden2 = Orden(productos2)
orden2.agregar_producto(producto1)
orden2.agregar_producto(producto2)
print(orden2)
print(f'Total de la orden2: {orden2.calcular_total()}')