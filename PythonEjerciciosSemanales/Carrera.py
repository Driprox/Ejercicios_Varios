"""/*
 * Crea un programa que simule la competición de dos coches en una pista.
 * - Los dos coches estarán representados por 🚙 y 🚗. Y la meta por 🏁.
 * - Cada pista tendrá entre 1 y 3 árboles 🌲 colocados de forma aleatoria.
 * - Las dos pistas tendrán una longitud configurable de guiones bajos "_".
 * - Los coches comenzarán en la parte derecha de las pistas. Ejemplo:
 *   🏁____🌲_____🚙
 *   🏁_🌲____🌲___🚗
 * 
 * El juego se desarrolla por turnos de forma automática, y cada segundo
 * se realiza una acción sobre los coches (moviéndose a la vez), hasta que
 * uno de ellos (o los dos a la vez) llega a la meta.
 * - Acciones:
 *   - Avanzar entre 1 a 3 posiciones hacia la meta.
 *   - Si al avanzar, el coche finaliza en la posición de un árbol,
 *     se muestra 💥 y no avanza durante un turno.
 *   - Cada turno se imprimen las pistas y sus elementos.
 *   - Cuando la carrera finalice, se muestra el coche ganador o el empate.
 */"""


import random

import time


class coche:
    """Aqui se cre una clase coche para poder crear varios a continuacion"""
    def __init__(self):
        self.imagen = ""

    def get_imagen(self):
        return self.imagen

    def set_imagen(self, imagen):
        self.imagen = imagen

    def recorrerCircuito(self, pista):
        """Esta funcion hara el recorrido del coche por el circuito, funcionara cada segundoo un if localizara cada vez la imagen del coche que precargamos y ortros iran comprobando en la posicion que es diferente a la lozalizacion si se concuerda con la imagen de concion que le pongo"""
        only = True
        tiempo = 0
        pista_completa = pista
        pista_completa[0] = self.imagen
        posicionCoche = 0
        print(*pista_completa)
        turno = 1
        while only == True:
            time.sleep(1)
            tiempo += 1
            aumentoVelocidad = random.randint(1, 3)
            posicionCoche += aumentoVelocidad
            if self.imagen in pista_completa:
                localizarCoche = pista_completa.index(self.imagen)
                pista_completa[localizarCoche] = "_"

            if posicionCoche >= len(pista_completa):
                break

            if pista_completa[posicionCoche] == '🌲':
                turno -= 1
                pista_completa[posicionCoche] = "💥"
            else:
                turno += 1
                pista_completa[posicionCoche] = self.imagen
            print(*pista_completa)
        return turno


def Circuito(tamaño):
    """Creara el circuito con la meta al final"""
    pista = []
    for a in range(tamaño):
        pista.append("_")
    pista.append("🏁")
    return pista


def arboles(pista):
    """Apartir del circuito añadira los arboles de forma alatoria siempre evitando el 0 y la posicion de la bandera"""
    pista_arboles = pista
    nArboles = random.randint(1, 3)#Aqui saca el numero de arboles que contendra la pista
    for a in range(nArboles):
        posicionArbol = random.randint(0, len(pista_arboles) - 1)#Aqui lo que va hacer es sacar cada posicion del arbol de forma aleatorio y siempre hay que descontarle un porque sino va a contar mas
        for b in pista_arboles:
            if pista_arboles[posicionArbol] != "🏁" and posicionArbol !=0:#Aqui lo colocara siguiendo el criteio del condicianl
                pista_arboles[posicionArbol] = "🌲" 
    return pista_arboles


tamaño1 = int(input("Dime el tamaño del circuito: "))
coche1 = coche()
coche2 = coche()
coche1.set_imagen("🚙")
coche2.set_imagen("🚗")
turno1 = coche1.recorrerCircuito(arboles(Circuito(tamaño1)))
turno2 = coche2.recorrerCircuito(arboles(Circuito(tamaño1)))
if turno1 == turno2:
    print("Empate")
elif turno1 <= turno2:
    print("Gana el coche 2")
else:
    print("Gana el coche 1")
