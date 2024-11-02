from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):
   #print(objeto) #De manera indirecta estamos llamando al metodo str de la clase empleado o la clase Gerente
    print(type(objeto)) #vemos el tipo de dato que recibe
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente): #comprueba si es de la clase Gerente.
        print(objeto.departamento)


empleado = Empleado('Ariel', 50000.00)
imprimir_detalles(empleado)

gerente = Gerente('Natalia', 60000.00, 'Sistema')
imprimir_detalles(gerente)



