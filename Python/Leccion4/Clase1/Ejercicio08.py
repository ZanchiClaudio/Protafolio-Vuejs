# Ejercicio 8: Menu interactivo - Cajer automatico
#Hacer un programa que simule un cajero automatico con saldo
#inicial de 1000$ y tendra el siguente menu de opciones:
#                   1. Ingresar dinero a la cuenta
#                   2. Retirar dinero de la cuenta
#                   3. Mostrar dinero disponible
#                   4. Salir
saldo = 1000
while True:
    print("\t.:MENU:.")
    print("1. Ingresar dinero a al cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    opcion = int(input("Digite una opcion de menu: "))
    print()
    if opcion == 1:
        extra = float(input("Cuanto dinero desea ingresar -> "))
        saldo += extra
        print(f"Dinero en la cuenta al momento: ${saldo}")
    elif opcion == 2:
        retirar = float(input("Cuanto dinero desea retirar -> "))
        if retirar > saldo:
            print("No tiene esa cantidad de dinero")
        else:
            saldo -= retirar
            print(f"Dinero en la cuenta al momento: ${saldo}")
    elif opcion == 3:
        print(f"Dinero en la cuenta al momento: ${saldo}")
    elif opcion == 4:
        print("Gracias por utilizar el cajero automatico. Hasta pronto")
        break
    else:
        print("Error, la opcion ingresada es incorrecta")
        print()

