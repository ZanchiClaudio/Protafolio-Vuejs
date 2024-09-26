class Persona:  #creamos una clase Definnicion de clase
    def __init__(self, nombre, apellido, edad):  #se lo llama metodo Init Dunder
        self.nombre = nombre  #'Juan'
        self.apellido = apellido  #'Zalazar'
        self.edad = edad  #22

    def mostrar_detalle(self):
        print(f"Persona: {self.apellido} {self.nombre} {self.edad}")  # se usa el self por que estamos dentro de la clase.


#persona1 es el objero y Persona es el constructor
persona1 = Persona('Claudio', 'Zanchi', '28')
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona('Pedro', 'Perez', '40')
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

persona1.mostrar_detalle()
persona2.mostrar_detalle()
