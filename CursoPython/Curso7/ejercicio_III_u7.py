import random

# Progrma de iraar dado con fncion
input("Pulsa para tirar el dado")
numero_Dado = random.randint(1, 6)
print(f"El numero ha acertar es {numero_Dado}")


def tirarDado(numeroDado, intento=1):
    numero = random.randint(1, 6)

    if numero != numeroDado:
        intento += 1
        if numeroDado < numero:
            print(f"El numero {numero} es superior,se vuelve a tirar")
        else:
            print(f"El numero {numero} es inferior,se vuelve a tirar")
        tirarDado(numeroDado, intento)
    else:
        print(f"Enhorabuena el {numero_Dado} ha salido en el intento numero {intento}")


tirarDado(numero_Dado)
