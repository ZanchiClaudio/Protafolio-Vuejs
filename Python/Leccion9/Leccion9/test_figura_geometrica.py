from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, 'Azul')
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'Calculo del area del cuadrado: {cuadrado1.calcular_area()}')

#MRO = Method resolution Order
print(Cuadrado.mro())
print(cuadrado1)

##Creamos un objeto de la clase rectangulo
rectangulo1 = Rectangulo(3, 8, 'Verde')
print(f'Calculo del area del rectangulo: {rectangulo1.calcular_area()}')
print(rectangulo1)
      