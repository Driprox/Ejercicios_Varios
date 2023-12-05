"""
 * ¿Conoces el calendario de aDEViento de la comunidad (https://adviento.dev)?
 * 24 días, 24 regalos sorpresa relacionados con desarrollo de software.
 * Desde el 1 al 24 de diciembre.
 *
 * Crea un programa que simule el mecanismo de participación:
 * - Mediante la terminal, el programa te preguntará si quieres añadir y borrar
 *   participantes, mostrarlos, lanzar el sorteo o salir.
 * - Si seleccionas añadir un participante, podrás escribir su nombre y pulsar enter.
 * - Si seleccionas añadir un participante, y este ya existe, avisarás de ello.
 *   (Y no lo duplicarás)
 * - Si seleccionas mostrar los participantes, se listarán todos.
 * - Si seleccionas eliminar un participante, podrás escribir su nombre y pulsar enter.
 *   (Avisando de si lo has eliminado o el nombre no existe)
 * - Si seleccionas realizar el sorteo, elegirás una persona al azar 
 *   y se eliminará del listado.
 * - Si seleccionas salir, el programa finalizará.
 """
import random
import sys


class usuarioSorteo:
    def __init__(self):
        self.nombre = input("")
        self.baseUsuario = []

    def mostrar(self):
        return self.baseUsuario

    def agregarUsuario(self):
        self.nombre = input("Dime el nombre de usuario: ")
        if self.nombre in self.baseUsuario:
            return "No se puede agregar el usuario ya existe"
        self.baseUsuario.append(self.nombre)
        return "Se agrego al usuario"

    def eliminarUsuario(self):
        self.nombre = input("Dime el usuario que quieres borrar: ")
        if self.nombre in self.baseUsuario:
            self.baseUsuario.remove(self.nombre)
            return "Se borro el usuario"

        return "No se encuentra el nombre de usuario"

    def sorteo(self):
        aleatorio = random.choice(self.baseUsuario)
        print(sorteo)
        self.baseUsuario.remove(aleatorio)
        print("Se borro al usuario")


sorteo = usuarioSorteo()
respuesta = "s"
while respuesta == "s":
    pulsar = int(
        input(
            "Dime que quieres hacer:\n 1-Agregar Usuario\n 2-Eliminar Usuario\n 3-Mostrar a todos los participantes\n 4-Lanzar el sorteo\n 5-Salir\n"
        )
    )
    if pulsar == 1:
        print(sorteo.agregarUsuario())
        respuesta = input("Quieres hacer otra cosa: s/n ")

    elif pulsar == 2:
        print(sorteo.eliminarUsuario())
        respuesta = input("Quieres hacer otra cosa: s/n ")
    elif pulsar == 3:
        print(sorteo.mostrar())
        respuesta = input("Quieres hacer otra cosa: s/n ")
    elif pulsar == 4:
        print(sorteo.sorteo())
        respuesta = input("Quieres hacer otra cosa: s/n ")
    elif pulsar == 5:
        print("Se salio del programa")
        sys.exit()
    else:
        print("El numero es incorrecto vuelva a introducir el numero")
