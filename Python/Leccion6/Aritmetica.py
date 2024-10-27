class Aritmetica:
    """
    Documentamos lo que realiza las clases y a esto se le llama:
    DocString
    Documentacion de la clase en python
    Vamos a hacer unas operaciones de : suma, resta , multiplicacion y mas
    """
    def __init__(self,operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    #Metodo para sumar
    def sumar(self):
        return self.operandoA + self.operandoB
    #metodo para restar
    def resta(self):
        return self.operandoA - self.operandoB
    #metodo de multiplicar
    def multiplicar(self):
        return self.operandoA * self.operandoB
    #metodo de dividir
    def dividir(self):
        return self.operandoA / self.operandoB

aritmetica1 = Aritmetica(7,9) #Le pasamos los argumentos para los operadores
print(f'La suma de los numeros es: {aritmetica1.sumar()}')
print(f'La resta de los numeros es: {aritmetica1.resta()}')
print(f'La multiplicacion de los numeros es: {aritmetica1.multiplicar()}')
print(f'La division de los numeros es: {aritmetica1.dividir():.2f}')
