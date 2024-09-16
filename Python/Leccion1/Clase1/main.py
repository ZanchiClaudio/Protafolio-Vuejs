# lista = Ariel , Liliana , Natalia, Osvaldo
#Colecciones en python
#Las listas es lo que se conoce en otros lenguajes como arreglos y vectores

nombres = ["Naty","Osvaldo","Lily","Ariel"] #Se utiliza corchetes
print(nombres)
print(nombres[0]) #muestra el valor de la posicion 0
print(nombres[2])
print(nombres[-1]) #Con los valors negativos inicia de atras para delante

print(nombres[0:2]) #recorre desde el 0 hasta el 1, no considera el 2
print(nombres[ :2]) #si se pone espacio, lo toma como un cero
print(nombres[1: ]) #recorre desde el 1 hasta el final de la lista

#Modificar un valor de la lista
nombres[2] = "Liliana"
nombres[0] = "Natalia"
print(nombres)

#iterar una lista
for nombre in nombres:
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

#Preguntamos cuantos elementos tiene la lista

print(len(nombres)) #le pasamos como parametro la lista

#Agregamos mas elementos a la lista

nombres.append("Mercelo")  #Inserta el elemnto al final de la lista
nombres.append([1,2,3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4,5])
nombres.append(7) ##Una lista permite varios tipos de datos, inclusos otra lista dentro de la lista
print(nombres)

#Insertar un elemento en un indice espesifico

nombres.insert(1,"Alberto")
nombres.insert(3,"Debora")#un tipo entero y yn objeto a ingresar
print(nombres)

#Eliminamos un elemnto

nombres.remove("Alberto") #Elimina el valor ingresado
print(nombres)

#Eliminar el ultimo elemnto

nombres.pop() #Elimina el ultimo elemento de la lista (no el ultimo elemnto ingresado)
print(nombres)

#eliminacion de un indice espesifico

del nombres[2] #del es de delete
print(nombres)

#Eliminar, borrar todos los elemetos o limpiar la lista

nombres.clear()
print(nombres)

#eliminar la lista

del nombres
## print(nombres) #da error por que no esta definida la lista nombres

##Tuplas
#Definimos una tupla

cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)

#Largo de la tupla

print(len(cocina))

#Acceder a un elemento, para esto se utiliza corchetes

print(cocina[0]) #imprime el elemento del indice 0 de la tupla
print(cocina[-1]) #de manera inversa, muestra de atras para delante

#Acceder a un rango
print(cocina[0:1]) #mustara desde el 0 hasta el ultimo menos 1

#Ejemplo
verduras = ("papa") #es una cadena no es una tupla
print(verduras)

verdurass = ("papa",) #Es una tupla, va con la coma al final
print(verdurass)

#recorremos los elemetos de la tupla

for cocinar in cocina:
    #print(cocinar) #print esta usando \n para salto de linea
    print(cocinar, end=" ") #imprime sin salto de linea

#cocina[0]= "plato" no deja modificar la tupla.
#print(cocina)

#Para realizar una modificacion a una tupla hay que transformarla a lista
#no es recomendable realizar esto

cocinaLista = list(cocina)
cocinaLista[0] = "plato"
cocina = tuple(cocinaLista)
print("\n", cocina)

#Eliminar una tupla

#del cocina
#print(cocina)


##Tipo set (conjuntos) No presenta indices

planetas = {"Martes", "Jupiter", "Venus"}
print(planetas)
print(len(planetas)) ##largo del conjunto o tipo set
#Revisamos si un elemento existe dento del tipo set
print("Martes" in planetas) #Entrega valor boolean. El valor buscado tiene que ser igual
print("Martes" not in planetas) #pregunto si no estra dentro del conjunto
#Agregamos un elemnto al conjunto
planetas.add("Tierra") #No se puede agrarar datos duplicados.
print(planetas)
#Eliminar elementos, si el elemento no exixte puede arrojar un error
planetas.remove("Tierra") #arroja error si no existe el elemento
print(planetas)
planetas.discard("Jupiter") #no tira error, pero no borra nada
print(planetas)

##limpiar el tipo set
planetas.clear() #lo deja vacio al conjunto
print(planetas)

##eliminar el tipo set
# del planetas
# print(planetas) ##arroja error por que el conjunto ya no existe

##Diccionario en python
#Un diccionario esta compuesto por dos elemntos UNA LLAVE Y UN VALOR
#dict(key,value)
diccionario = {
    "IDE" : "Integrated Development Environment",
    "POO" : "Programacion Orientada a Objetos",
    "SABD" : "Sistema de Administracion de Base de Datos"
}
print(diccionario)
print(len(diccionario)) #Muestra la cantida de elementos del diccionario
#Acceder a un elemnto del diccionario con la llave (key)
print(diccionario["IDE"]) #Tiene que ser la llave identica para que no arroje el error
##Otra forma de recuperar un elemnto
print(diccionario.get("POO")) #mediante la funcion get
print(diccionario.get("SABD"))

##Modificar los elemntos del diccionario
diccionario["IDE"] = "Entorno de Desarrollo Integrado"
print(diccionario)

##Como recorrer los elementos
for termino in diccionario:
    print(termino) ##solo accedemos a las llaves
#no se puede acceder al valor de manera directa

#Necesitamos una funcion para recorrer un dicionario
for termino, valor in diccionario.items():
    print(termino,valor)

##otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino) #Muestra solo las llaves

for valor in diccionario.values():
    print(valor) #Muestra los valores sin las llaves

##comprobar la existencia de algun elemento
print("IDE" in diccionario) #valor booleano
print("IDE" not in diccionario)

#Agregar un elemnto
diccionario["PK"] = "Primari key" #no permite dos llaves iguales.Solo la modificaria
print(diccionario)

#eliminar un elemnto
diccionario.pop("SABD") #Elimina la llave como el valor de la misma
print(diccionario)

#Vaciar un diccionario
diccionario.clear()
print(diccionario)

#eliminar el diccionario
del diccionario


##concatenar listas

lista1 = [1,2,3]
lista2 = [4,5,1]
lista3 = lista1+lista2 #concatenacion de las listas
print(lista3)

lista3.extend([7,8,9,1]) #agregamos varios elemntos a la lista
print(lista3)

print(lista3.index(5))#Funcion para ubicar en que ibndice esta el valor de una lista.
#Si el valor buscado no esta en la lista nos tira un error

#como saber cuantos valores repetidos tine una lista
print(lista3.count(1)) #cuenta cuanto valores iguales hay dentro de la lista

#para poner al reves la lista
lista3.reverse()
print(lista3)

#para que una lista se multiplique repitirndo sus elemntos
lista = [1,2,3] * 2
print(lista)
lista3 = lista3 *2
print(lista3)

#Metodo de ordenamiento
lista3.sort() #ordena de manera acendente la lista
print(lista3)
lista3.sort(reverse=True) #De manera desendente
print(lista3)

##Repaso de Tuplas
tupla = (4, "hola", 6.78, [1,2,78], 4, "holaa") #puede tener diferentres tipos de datos
print(tupla)
print(4 in tupla) #devuelve un tipo boolean
print("hola" not in tupla)
#lo que podemos usar dentro de tuplas son: index, count, len
#se pueden convertir de tuplas a listas y viseversa
