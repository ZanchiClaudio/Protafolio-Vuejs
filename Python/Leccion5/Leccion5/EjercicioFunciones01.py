#Ejercicio1: Crear un afuncion para sumar los valores recibidos de tipo
# numerico, utilizando argumentos variables *args como parametro de la Funcion
# y agregar como resulta la suma de todos los valores pasados como argumento
#Definimos una funcion
def sumar_valor(*args):  # se denomina firma de nuestra funcion, recive una cantidad indefinida de argumentos
    #pass  #Se deja para seguir fuera de la funcion sin que nos tire un error
    resultado = 0
    #Iteramos cada elemento
    for valor in args:
        resultado += valor
    return resultado

#Llamamos la funcion
print(sumar_valor(3, 5, 9, 2, 1))
