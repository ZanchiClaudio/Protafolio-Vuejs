class MiClase:
    # Variable de clase, este atributo dara a cada onjeto el mismo valor
    variable_clase = "Esta es una variable de clase"

    def __init__(self, varieble_intancia): #La variable de instancia da diferentes valores
        self.variable_instancia = varieble_intancia

print(MiClase.variable_clase)

miClase1 = MiClase('esta es una variable de instancia')
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2 = MiClase('Esta es otra prueba de variable de instancia')
print(miClase2.variable_instancia)
print(miClase2.variable_clase)
