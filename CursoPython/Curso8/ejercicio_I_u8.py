import random

# Prueba de paquetes


def genererarNumero():
    listaNumero = []
    for i in range(7):
        numero = random.randint(1, 100)
        listaNumero.append(numero)
    return listaNumero


def ordenar(lista):
    lista.sort()
    return lista


def mostrar(valor):
    print(valor)
