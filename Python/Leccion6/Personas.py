class Persona:  #creamos una clase Definnicion de clase
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):  #se lo llama metodo Init Dunder, le agregamos los argumentos variables
        self.nombre = nombre  #'Juan'
        self.apellido = apellido  #'Zalazar'
        self._dni = dni #Este atributo esta encapsulado de una manera sugerida
        self.edad = edad  #22
        self.args = args
        self.kwargs = kwargs


    def mostrar_detalle(self): ## self es igual a this
        print(f"La clase Persona tiene los siguientes datos: {self.apellido} {self.nombre} {self._dni}{self.edad}, la direccion es:  {self.args}, los datos importantes son: {self.kwargs}")  # se usa el self por que estamos dentro de la clase.


#persona1 es el objero y Persona es el constructor
persona1 = Persona('Claudio', 'Zanchi', 32156488, '28')
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona('Pedro', 'Perez',1566689, '40')
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido}, su esdad es: {persona2.edad}")
#Tarea, realizar lo miamo con lo de la persona1
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido}, su esdad es: {persona1.edad}")

#Modificacion de objetos
persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido}, su esdad es: {persona1.edad}")

#los atributos son: caracteristicas
#los metodos son: el comportamiento que van a tener los objetos (Accione)

persona1.mostrar_detalle() #La referencia se pasa de manera automatica
persona2.mostrar_detalle()

##Clase 07
Persona.mostrar_detalle(persona1) #Tenemos que pasar la referencia si o si o tita error
#No recomendable la utilizacion de esta forma

#Se puede agregar atributos que no estan en el init
persona1.telefono = '45884531'
print(f' Este es el telefono : {persona1.nombre} {persona1.telefono}')

# print(persona2.telefono) el objeto no tiene este atributo, da error.
persona3 = Persona('Rogelio', 'Romero', 12345624,'33', 'Telefono', '54221566652', 'Calle Lopez', 823, 'Manzana', 77, 'Casa',18, Altura=1.83, Peso=105, CFavorito='Azul', Auto='Citroen', Modelo=2023)
persona3.mostrar_detalle()
print(persona3._dni) #No se tiene que utilizar de esta manera. esta encapsulado
#persona3.__nombre #esta totalmente encapsulado con el doble guion








