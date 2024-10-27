# Ejercicio 4: Sumar numeros pares dentro de un rango
# hacer un programa para sumar numeros pares dentro de un rango,
# Por ejemplo:
#              suma de numeros pares del 2 al 30
#              suma  = 240

a = int(input("Digite de donde va a comenzar la suma "))
b = int(input("Digite el numero donde va a terminar la suma"))
suma = 0
for i in range(a, b+1):
    if i%2 == 0: #Verificamos si es un numero par
        suma += i #Sumamos el numero par a la variable suma
print(f"\nLa suma de numeros pares del rango ingresado es: {suma}")
