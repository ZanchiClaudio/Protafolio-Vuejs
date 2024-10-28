class Persona:
    """

    """
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __str__(self): ##Override, es decir, sobrescribe
        return f'Persona: [Nombre:{self._nombre}, Edad: {self._edad}]'
    ##lo sobreescribe a todo en string.

class Empleado(Persona): #al poner en los parentesis, decimos que la clase empleado es la hija de la clase persona
    """

    """
    def __init__(self,nombre, edad, sueldo):
        super().__init__(nombre, edad) #Usamos las caracteristicas de la clase persona
        self._sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f'Empleado: [ Sueldo: {self._sueldo}] {super().__str__()}'

empleado1 = Empleado('Pepe',40 ,75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)
#tarea: encapsular los atributos y agregar los metodos getter and setters.
#crear otro objeto, pasar los datos para nombre edad y sueldo
#Mostrar estos datos, luego modificar y mostrar

empleado2 = Empleado('Mariano', 42, 500000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
empleado2.nombre = 'Mariana'
empleado2.edad = 40
empleado2.sueldo = 550000
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)



