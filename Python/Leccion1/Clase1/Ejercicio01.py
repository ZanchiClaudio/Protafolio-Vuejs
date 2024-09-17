#Ejercicio 01 : Llenar una lista
#Llenar una lista con los numeros de 1 a 50, luego mostrar
#la lista con un bucle for, los elementos deben mostrarse de la siguente forma
#1-2-3-4........-50

lista = [] #creacion de la lista
i = 1
while i <= 50:
    lista.append(i)
    i += 1

for i in lista:
    print(i, end="-")
print("")
 ##De forma mas eficiente
lista2 = list(range(1,51))
for i in lista2:
    print(i, end="-")
