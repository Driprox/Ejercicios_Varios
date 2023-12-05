try:
    numero = int(input("Dime el numero que deseas obtener la tabla de multiplicar: "))
    for a in range(10 + 1):
        print(f"{numero}X{a}={numero*a}")
except ValueError:
    print("Error: Introduce un número entero válido.")
