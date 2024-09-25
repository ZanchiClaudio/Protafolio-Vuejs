#Ejercicio5: Convertidor  de temperaturas
#Realizar dos funciones para convertir de grados celsius a fahrenheit y viseversa
#Investigar las formulas

#Creacion de funcion de ªC a ªF
def celsius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32 #multiplica, divide y luego suma, lee de izq a der
#Creacion de funcion de ºF a ºC
def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9

celsius = float(input("Digite el valor de la temp en ºC: "))
resultado = celsius_fahrenheit(celsius)
print(f"{celsius} ºC equivale a {resultado:.2f}ºF")

fahrenheit = float(input("Digite el valor de la temo en ºF: "))
resultado = fahrenheit_celsius(fahrenheit)
print(f"{fahrenheit}ºF equivale a {resultado:.2f}ºC")