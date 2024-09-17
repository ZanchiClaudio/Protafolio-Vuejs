import math  #importamos la clase para el uso de la funcion de la raiz
#Dada la siguiente tupla
tupla = (13,1,8,3,2,5,8) #definimos la tupla
#Crear una lista que solo incluya los numeros menores a 5
#e imprima por consola [1,3,2]

lista = [] #Definimos la lista
#filtramos los elemntos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)

print(lista)

#Ejercicio matematio
#Para sacar la raiz de un numero positivo
numero = int(input('Digite un numero positivo'))
while numero < 0:
    print('Error -> deberia ser un numero positivo')
    numero = int(input('Digite un numero positivo'))
print(f"\nSu raiz cuadrada es: {math.sqrt(numero):.2f}")##:.2f es para que solo muestre 2 decimales solamnete




