class Vehiculo:
    """
    Definimos una clase padre llamada Vehiculo y dos clases hijas llamadas
    Auto y Bicicleta, las cuales heredan de la clase padre vehiculo. La clase
    padre de tener  los siguientes atributos y metodos

    Vehiculo (clase padre)
    -atributos (color, rueda)
    -Metodo (__init__(color, rueda) y __str__())

    Auto (clase hija de Vehiculo)
    -Atributos (velocidad (Km/Hs)
    -Metodos(__init__(color, ruedas, velocidad) y __str__())

    Bicicleta(clase hija de Vehiculo)
    -Atributos (tipo(urbana/montaña/etc)
    -Metodos(__init__() y __str__())
    Crear un objeto con cada clase
    """
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return 'Color: '+self.color+', Ruedas: '+str(self.ruedas)

class Auto(Vehiculo):
    def __init__(self, color, ruedas, velcidad):
        super().__init__(color, ruedas)
        self.velocidad = velcidad

    def __str__(self):
        return super().__str__()+', Velocidad(Km/Hs): '+ str(self.velocidad)

class   Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__()+', Tipo: '+self.tipo



#creacion del primer Objeto Vehiculo
vehiculo = Vehiculo('Blanco' , 4)
print(vehiculo)

#Creacion del segundo objeto
auto = Auto('Amarillo', 4, 200)
print(auto)

#Creacion del tercer objeto bicicleta
bici = Bicicleta('Azul', 2, 'Montaña')
print(bici)



