#Ejercicio 03 : Insertar elemntos y ordenarlos
#Pedir numeros y meterlos en una lista, cuando el ususrio
#introduzca un numero 0, nuestro programa dejaria de insertar.
#or ultimo, mostrar los numeros ordenado de menor a mayor

lista=[]
salir= False
while not salir:
    numero = int(input('Digite un numero: '))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
#Tenemos una funcion de ordenamiento en python
lista.sort()
print(f'\nLista ordenada: \n{lista}')
