#Ejercico3: Funcion recursiva
#Imprimir numero de 5 a 1 de manera decendente usando funciones recursivas
#Puede ser cualquier valo positivo, por ejemplo, si pasamos el valor de 5 debe imprimir:
#5
#4
#3
#2
#1
#En caso de ser el numero 3:
#3
#2
#1
#Si ingresa numero negativo o 0 no imprimir nada

def imprimir_numeros_recursivos(numero):
    if numero >= 1:
        print(numero)
        imprimir_numeros_recursivos(numero-1)
    elif numero == 0:
        return
    elif numero <= 0:
        print("El valor es incorrecto....")

imprimir_numeros_recursivos(5)
##Tarea: Hacer que el numero lo ingrese el usuario
imprimir_numeros_recursivos(int(input("Ingrese un valor positivo: ")))
