# Programa de comprobacion
numero = 28
numeroComprueba = numero
listaDivisores = []
for divisor in range(1, numero + 1):
    if numero % divisor == 0:
        listaDivisores.append(divisor)
    else:
        continue
    resultadoSuma = sum(listaDivisores)
    if numeroComprueba == resultadoSuma:
        print(listaDivisores)


def esnegativo(numero):
    # Devuelve el número si es negativo
    return numero < 0


lista5 = [-3, -2, 0, 1, 9, -5]
print(esnegativo(lista5))

# Muestra los números negativos de la lista
# La función esnegativo() es llamada para comprobar,
# uno a uno, todos los números de la lista
a = filter(esnegativo, lista5)
# si intentase imprimir "a" con print(a) me devolvería el tipo de dato
# pero no podría imprimir el contenido de "a"
# Para ver el resultado, puedo recorrer el iterable "a"
# a través de un bucle e imprimirlos uno a uno
for o in a:
    print(o)

# O para ver el resultado como una lista debo convertir
# el iterable "a" en una lista y a continuación imprimirlo
a = filter(esnegativo, lista5)
b = list(a)
print(b)


def cuadrado(numero):
    return numero**2


lista1 = [-2, 4, -6, 8]

# Convierte directamente a lista el iterador obtenido al aplicar la función map()
lista2 = list(map(cuadrado, lista1))

# Muestra elementos de la lista
print(lista2)  # 4, 16, 36, 64'''


def jugar(intento=1):
    respuesta = input("¿De qué color es una naranja? ")
    if respuesta != "naranja":
        if intento < 3:
            print("\nFallaste! Inténtalo de nuevo")
            intento += 1
            jugar(intento)  # Llamada recursiva
        else:
            print("Perdiste!")
    else:
        print("Ganaste!")


jugar()


objeto = "Hola"


def funcion():
    objeto = 2
    print(objeto)


funcion()
print(objeto)
