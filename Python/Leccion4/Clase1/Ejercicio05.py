# Ejercicio 5: Factorial de un numero positivo
# Hacer un programa para calcular el factorial de un numero positivo
numero = int(input("Digite un numero: "))
while numero < 0: #Mientas sea negativo
    print("Error -> el numero tiene que ser positivo")
    numero = int(input("Digite un numero: "))
factorial = 1 #variable que calculara el factorial del numero ingresado
for i in range(1, numero + 1 ):
    factorial *= i
print(f"\nEl factorial del numero {numero} positivo ingresado es: {factorial} ")
