# Programa que te da la tabla de multiplizar haste el 10

numero = int(input("Dime un numero mayor que 1 "))

if numero <= 1:
    print("Numero erroneo es menor a 1")
else:
    for i in range(11):
        operacion = numero * i
        print(f"{numero} X {i} = {operacion}")


# Programa que pide un rango y te da numeros pares e impares la cantidad

rangoComienzo = int(input("Dime desde donde empieza a contar "))
rangoFinal = int(input("Dime desde hasta donde quieres contar "))

par = 0
impar = 0

for i in range(rangoComienzo, rangoFinal):
    if i % 2 == 0:
        par = par + 1
    else:
        impar = impar + 1

print(f"El numero de pares es {par} y el de impares es de {impar}")

# Programa de dado

import random

numeroDado = 0

while numeroDado != 6:
    numeroDado = random.randint(1, 6)
    if numeroDado != 6:
        print(f"Ha salido {numeroDado} vuelve a tirar")

print("Bien por fin a salido el 6")

# Programa de luista correcta

numeroSolicitado = int(input("Dime un numero entre el 0 y el 9 "))
listaNumeros = [4, 7, 9]

while numeroSolicitado not in listaNumeros:
    numeroSolicitado = int(input("Lo siento no es correcto vuelve a intentarlo: "))

print("Bien has acertado")


# Programa dibujo cuadraddos

columnas = int(input("Escribe el número de columnas:"))
filas = int(input("Escribe el número de filas:"))
while filas < 1 or columnas < 1:
    print(
        "No empezamos bien... para dibujar un rectángulo no puedo usar números negativos"
    )
    columnas = int(input("Escribe el número de columnas:"))
    filas = int(input("Escribe el número de filas:"))
for i in range(1, filas + 1):
    for j in range(1, columnas + 1):
        print("*", end="")
    print("")
