class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other): #other se puede cambiar
        return f'{self.nombre} {other.nombre}'

    def __sub__(self, otro):
        return self.edad - otro.edad

persona1 = Persona('Ariel', 40)
persona2 = Persona('Betancud', 5)

#persona1.__add__(persona2) #sintaxis interna y automatica
print(persona1 + persona2) #como se presenta y este llama al __add__
print(persona1 - persona2)