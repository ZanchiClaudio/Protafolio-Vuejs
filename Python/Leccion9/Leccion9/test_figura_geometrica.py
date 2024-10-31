from Cuadrado import Cuadrado
from FiguraGeometrica import FiguraGeometrica
from Rectangulo import Rectangulo

print('Creacion de objeto clase Cuadrado'.center(50, '_'))
cuadrado1 = Cuadrado(5, 'Azul')
cuadrado1.alto = -10
#print(cuadrado1.ancho)
#print(cuadrado1.alto)
print(f'Calculo del area del cuadrado: {cuadrado1.calcular_area()}')

#MRO = Method resolution Order
#print(Cuadrado.mro())
print(cuadrado1)

##Creamos un objeto de la clase rectangulo
print('Creacion de objeto clase Rectangulo'.center(50, '_'))
rectangulo1 = Rectangulo(3, 8, 'Verde')
rectangulo1.ancho = 15
print(f'Calculo del area del rectangulo: {rectangulo1.calcular_area()}')
print(rectangulo1)

#figura1 = FiguraGeometrica() No se puede instanciar dado que es abstracta
print(Cuadrado.mro())
