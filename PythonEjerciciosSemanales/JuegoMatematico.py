"""Crea un juego interactivo por terminal en el que tendrás que adivinar 
 * el resultado de diferentes operaciones matemáticas aleatorias
 * (suma, resta, multiplicación o división de dos números enteros).
 * - Tendrás 3 segundos para responder correctamente.
 * - El juego finaliza si no se logra responder en ese tiempo.
 * - Al finalizar el juego debes mostrar cuántos cálculos has acertado.
 * - Cada 5 aciertos debes aumentar en uno el posible número de cifras 
 *   de la operación (cada vez en un operando):
 *   - Preguntas 1 a 5: X (entre 0 y 9) operación Y (entre 0 y 9)
 *   - Preguntas 6 a 10: XX (entre 0 y 99) operación Y (entre 0 y 9)
 *   - Preguntas 11 a 15: XX operación YY
 *   - Preguntas 16 a 20: XXX (entre 0 y 999) operación YY
 """
import random
import time

activado = True
error = False


def contador(tiempo):
    """Es un intento de definicion de contador"""
    while tiempo >= 0:
        time.sleep(1)
        operaciones()
        print(f"Tienes {tiempo} segundos")
        tiempo -= 1


def operaciones():
    """Una serie de operaciones automaticas"""
    contador(3)
    signos = ["+", "*", "/", "-"]
    acierto = 0
    signoAlt = random.choice(signos)
    numero1 = random.randint(0, 10)
    numero2 = random.randint(0, 10)
    resultado = 0
    if signoAlt == "+":
        print(f"{numero1}+{numero2}")
        resultado = numero1 + numero2
    elif signoAlt == "-":
        print(f"{numero1}-{numero2}")
        resultado = numero1 - numero2
    elif signoAlt == "*":
        print(f"{numero1}*{numero2}")
        resultado = numero1 * numero2
    elif signoAlt == "/":
        if numero2 == 0:
            pass
        print(f"{numero1}/{numero2}")
        resultado = numero1 / numero2
    else:
        print("Algo ha salido mal")
    resultadoAlt = float(resultado)
    respuesta = input("Dime cual es el resultado: ")
    respuestaAlt = float(respuesta)
    if respuestaAlt == resultadoAlt:
        acierto += 1
        if acierto == 20:
            print("Felicidades has acabado el juego")
        return 3

    else:
        print("Has fallado")
