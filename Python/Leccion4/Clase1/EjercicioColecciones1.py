##Ejercicio1: Eliminar duplicados de una lista
#Escriba un programa donde tenga una lista y que a continuacion
#elimine los elemntos repetidos, por ultimo mostrar la lista

#Creamos una lista
lista = [1,2,3,'Claudio', 7,7,3,'Esteban',5,'Esteban', 1,2,'Claudio']
#conjunto = set(lista)#Convertimos la lista a un conjunto de tipo set
#lista = list(conjunto)#Convertimos el conjunto en una lista
#print(lista)
lista = list(set(lista))
print(lista)