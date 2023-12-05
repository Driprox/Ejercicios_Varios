import random
#App de dado
numeroSolicitado = int(input("Dime un numero al azar entre el 1 y el 10 "))
numeroAzar = random.randint(1, 10)
conteo = 0
listaError = []
while numeroSolicitado != numeroAzar:
    conteo += 1
    listaError.append(numeroSolicitado)
    print(
        f"Lo siento el numero no es correcto llevas {conteo} de intentos, has dicho los siguientes numeros {listaError}"
    )
    numeroSolicitado = int(input("Dime otro numero "))
print(f"Bien as acertado era {numeroAzar} con un total de {conteo} de intentos")
