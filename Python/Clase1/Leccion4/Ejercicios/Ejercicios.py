#Iterara un rango de 0 a 10 e imprime numeros divisible entre 3
#Ejemplo: 0,3,6,9
print("Ejercicio N1")
for i in range(11):
    if i % 3 ==0:
        print(i)

#Crear un rango de numeros de 2 a 6. imprimelo. Ej: 2,3,4,5,6

print("Ejercicio N2")

rango=range(2,7)
for i in rango:
    print(i)

# Ejercicio 3: Crea un rango de 3 a 10 pero con incremento de 2 en 2
# en lugar de 1 en 1. Ej: 3,5,7,9

print("Ejercicio N3")
num = 3
for i in range(3,10):
    if i == 3:
        print(num)
    else:
        num += 2
        if num < 10:
            print(num)
print("Ejercicio de forma resumida")
for i in range(3,11,2): #los primeros son los valores del rango y el ultimo es el paso
    print(i)





