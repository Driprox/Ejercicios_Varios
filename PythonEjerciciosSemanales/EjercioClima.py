"""
 * Crea una función que simule las condiciones climáticas (temperatura y probabilidad de lluvia)
 * de un lugar ficticio al pasar un número concreto de días según estas reglas:
 * - La temperatura inicial y el % de probabilidad de lluvia lo define el usuario.
 * - Cada día que pasa:
 *   - 10% de posibilidades de que la temperatura aumente o disminuya 2 grados.
 *   - Si la temperatura supera los 25 grados, la probabilidad de lluvia al día 
 *     siguiente aumenta en un 20%.
 *   - Si la temperatura baja de 5 grados, la probabilidad de lluvia al día 
 *     siguiente disminuya en un 20%.
 *   - Si llueve (100%), la temperatura del día siguiente disminuye en 1 grado.
 * - La función recibe el número de días de la predicción y muestra la temperatura
 *   y si llueve durante todos esos días.
 * - También mostrará la temperatura máxima y mínima de ese periodo y cuántos días va a llover.
"""
import random

dias = int(input("Dime el numero de dias de la prediccion: "))


def clima(nDias):
    temperatura = int(input("Dime la temperatura inicial: "))
    probabilidad = int(input("Dime la probabilidad de lluvia inicial: "))
    listaTemperatura = []
    diasLlueve = 0

    for inicio in range(nDias):
        probabilidadTemperatura = random.randint(1, 10)
        if probabilidadTemperatura == 1:
            subidaBajada = random.randint(1, 2)
            if subidaBajada == 1:
                temperatura += 2
            else:
                temperatura -= 2

        listaTemperatura.append(temperatura)
        if temperatura > 25:
            probabilidad += 20
            if probabilidad > 100:
                probabilidad = 100
        elif temperatura < 5:
            probabilidad -= 20
            if probabilidad < 0:
                probabilidad = 0
        elif probabilidad == 100:
            diasLlueve += 1
            temperatura -= 1
    if diasLlueve == nDias:
        print("Ha llovido todos los dias")
    print(listaTemperatura)
    print(
        f"La temperatura del ultimo dia es {temperatura} y la probabilidad de lluvia esta un {probabilidad}%"
    )
    print(
        f"La temperatura maxima a sido de {max(listaTemperatura)} y la temperatura minima ha sido de {min(listaTemperatura)} y los dias en los que ha llovido han sido un total de {diasLlueve}"
    )


clima(dias)
