class Rectangulo:
    """
    Crear una clase llamada rectangulo, debe tener 2 atributos: altura y base
    el nombre del metodo sera calcular_area utilizando la formula:
    area=base*altura. Pero la base y la altura deben ser ingresadas por el usiario
    y los objetos deben ser tres

    """
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    #Calculo del area atraves del metodo
    def calcular_area(self):
        return self.altura * self.base

base = int(input('Digite la base del rectangulo: '))
altura = int(input('Digite la altura del rectngulo: '))
rectangulo1 = Rectangulo(altura, base)
print(f'El area del rectangulo es: {rectangulo1.calcular_area()}')
