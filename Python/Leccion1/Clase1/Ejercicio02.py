#Ejercicio 02 : Modificar los elementos de ina lista
#Llenar una lista con los  numero de 1 al 10, luego modificar los
# elementos de la lista multiplicandolos por un valor ingresado por el usuarios

lista = list(range(1,11))
print('Lista original')
for i in lista:
    print(i, end='-')
valor = int(input('\nDigite un valor a multiplicar: '))
#Multiplicamos todos los elementos de la lista
for indice, i in enumerate(lista):#Funcion para modificar los indicadores de las listas
    lista[indice] *= valor#El iterador solo recorre los indices en la lista de multiplicacion
print(f'Listta final con los elementos multiplicados por {valor}')
for i in lista:
    print(i, end='-')

