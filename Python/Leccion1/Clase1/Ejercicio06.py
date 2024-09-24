# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un numero por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10. Por ejemplo:
# Si digita el 5 la lista tendra: 5,10,15,20,25,30,35,40,45,50

numero = int(input("Digite un numero: "))
lista = [] #Creacion de la llista vacia
for i in range(1, 11 ):
    lista.append(i*numero)
print(f"\nTabla de multiplicar del {numero}: \n {lista}")

#Para ver la lista como una tabla de multiplicacion
for indice,i in enumerate(lista): #Se genera una variable indice.
    print(f"{numero} X {indice+1} = {lista[indice]}") #Indice nos permite recorrel la lista e ir mostrando e contenido de ese espacio
