# Ejercicio2: Funcion con *args para multiplicar
# Crear una funcion para multiplicar los valores recibidos
# de tipo numerico utiliznzo argumentos variables *args
# como parametros de la funcion y regresar como resultado
# la multilicacion de todos los valores

#Definimos la funcion
def multiplicacion_valors(*args):
    resultado = 1 #dedo que el 0 nos va a devolver siempre 0 en la multiplicacion
    for numero in args:
        resultado *= numero
    return resultado


#llamamos a la funcion
print(multiplicacion_valors(3, 5, 15)) #Le pasamos los argumentos