class Producto:
    contador_producto = 0 #variable de clase

    def __init__(self, nombre, precio):
        Producto.contador_producto += 1 #incrementamos la variable clase
        self._id_producto = Producto.contador_producto #asignacion desde la variable clase
        self._nombre = nombre
        self._precio = precio

#metodos setter and getter
    @property
    def nombre(self):
        return self._nombre
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, precio):
        self._precio = precio

#Sobre escribimos el metodo srt
    def __str__(self):
        return f'Id Producto: {self._id_producto}, Nombre: {self._nombre}, Precio: {self._precio}'

if __name__ == '__main__': #solo seran visibles si la pruebas se ejecuta desde aqui
    producto1 = Producto('Camiseta', 100.00)
    print(producto1)
    producto2 = Producto('Pantalon', 150.00)
    print(producto2)