# Comenzamos con funcione.

# Definimos una funcion con la palabra def

# mi_funcion  no se puede llamar a la funcion sin antes de ser definida
def mi_funcion(): #si o si lleva los parentesis, y puede necesitar parametros
    print('Saludos a todos los alumnos de la Tecnicatura')

mi_funcion() # llamamos a la funcion creada
mi_funcion()
mi_funcion() # Se puede llamar n veces a la funcion

#Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name+''+lastName)
person = ['Claudio', 'Zanchi']
show(person[0], person[1]) #Pasamos uno por uno lso datos de la lista a la funcion
show(*person) #Muestra lo mismo que lo anteriro pero le passamos todo junto
person2 = ("Esteban", "Zanchi") #desempaquetamos a traves de una tupla
show(*person2)
person3 = {"lastName": "Zanchi", "name": "Claudio"}
show(**person3)

numbers = [1, 2, 3, 4, 5] #lista
for n in numbers:
    print(n)
else: #Siempre entra en el else, salvo que tenga un break antes del else.
    print("Esto se termino")

#List comprehension, lista de compresion
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == "P"] #Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artols", "country": "Belgium"}]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

#Paso de argumentos  (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos lo que ven a traves de YouTube")
    print(f"Nombre: {name}, Apellido: {lastName}")
mi_funcion2("Jorge", "Lucero")
mi_funcion2("Claudio", "Zanchi")
mi_funcion2("Analia", "Pedrosa")

#La palabra return en funciones
def sumar(a, b):
    return a + b
resultado = sumar(78, 22)
print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55,45)}')

##Valor por defaul
def sumar2(a:int =0, b:int =0): #Se le da un valor por defaul
    return a + b
resultado = sumar2() #dado que ya tienen valores o tira error
print(f"Resultadi de la suma: {resultado}")
print(f"El resultado de la suma: {sumar2(22, 66)}") #al pasarle un argumento, el valor por defaul no lo toma.

#Argumentos, variables en funciones
def listarNombres(*nombres): #Lo toma como indeterminado a los argumentos que se envian a la funcion
    for nombre in nombres:    ##En la sintaxis se utiliza *args y se convierte en una tupla
        print(nombre)
listarNombres("Lucas", "Jose", "Claudia", "Rosa", "Maria")
listarNombres("Marcos", "Daniel", "Romina", "Pepe", "Marcela", "Carlos")

def listarTerminos(**terminos): #lo que se utiliza es **kwagrs como argumento variable
    for llave, valor in terminos.items(): #kwargs significa: key word argument
        print(f"{llave}: {valor}")

listarTerminos() #no se muestra nada
listarTerminos(IDE = 'Integrated Develoment Enviroment', PK='Primaruy Key')
listarTerminos(Nombre='Leonel Messi')

#Distintos tipos de datos como argumentos
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombre2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombre2)
desplegarNombres('Claudio')
#desplegarNombres(10, 11) #No permite los numero, dado que no es iterable
desplegarNombres((10, 11)) #lo comvertimos en una tuppla que es iterable, en un solo elemento no olvidar la coma
desplegarNombres([22, 55]) #lo tansformamos en una lista que es iterable

#Funcion recursiva
def factorial(numero):
    if numero == 1: #Caso base
        return 1
    else:
        return numero * factorial(numero-1) #caso recursivo

resultado = factorial(5) #Lo haemos en codigo duro
print(f"El factorial de 5 es: {resultado}")
#Tarea: hacer que el usuario ingrese el numero
numeroIngresado = int (input("Ingrese un numero para calcular el factorial: "))
print(f"El factorial de {numeroIngresado} es: {factorial(numeroIngresado)}")







