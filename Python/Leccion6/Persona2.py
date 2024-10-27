class Persona2:
    """

    """
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalle(self):
        print(f'Los datos a mostar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    ##metodo getter
    @property #decorador
    def nombre(self): #metodo Getter
        print('Estamos usando el metodo get')
        return self._nombre

    ##Metodo Setter
    @nombre.setter
    def nombre(self, nombre):
        print('Estamos utilizando el metodo set')
        self._nombre = nombre

    @property  # decorador
    def apellido(self):  # metodo Getter
        return self._apellido
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property  # decorador
    def edad(self):  # metodo Getter
        return self._edad
    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre}{self._apellido}{self._edad}')

if __name__ == '__main__':
    persona1 = Persona2('Claudio', 'Zanchi', 29)
    #print(persona1._nombre) No se debe hacer, se puede paro no es asi.
    print(persona1.nombre) #llamamos el metodo getter
    persona1.nombre = 'Juan' #llamamos al metodo setter
    print(persona1.nombre) #llamamos el metodo getter
    print(persona1.mostrar_detalle())
    #Atributo read-only. Es un atributo que no tiene su metodo set, es dedir solo lectura
    #persona1.edad = 40
    print(persona1.edad)

    #Tarea: crear 3 objetos mas utilizando los metodos getter and setter
    #para modificar y mostrar los cambios
    persona2 = Persona2('Maria', 'Rodriguez', 30)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'Mari'
    persona2.apellido = 'Rodrigues'
    persona2.edad = 28
    print(persona2.mostrar_detalle())

    persona3 = Persona2('Raul', 'Peres', 32)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Pedro'
    persona3.apellido = 'Perez'
    persona3.edad = 29
    print(persona3.mostrar_detalle())

    persona4 = Persona2('Yamila', 'Rosa', 20)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Yami'
    persona4.apellido = 'Roza'
    persona4.edad = 25
    print(persona4.mostrar_detalle())


    print(__name__) ##comprobacion del metodo principal
