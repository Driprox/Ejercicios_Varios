# Programa Numero perfecto
def perfecto(numero):
    """Funcion de numero perfecto"""
    numeroComprueba = numero
    listaDivisores = []
    for divisor in range(1, numero + 1):
        if numero % divisor == 0 and divisor != numero:
            listaDivisores.append(divisor)
        else:
            continue
    resultadoSuma = sum(listaDivisores)
    if numeroComprueba == resultadoSuma:
        return numeroComprueba


listaNumeroPerfectos = []
for i in range(1, 1000):
    if perfecto(i) == i:
        listaNumeroPerfectos.append(perfecto(i))
print(listaNumeroPerfectos)
