#App de factorial
numero = int(input("Dime un numero que quiereas sacar su factorial "))
total = 0
for i in range(0, numero):
    multiplicador = numero - i - 1

    if multiplicador == 0:
        break
    if total != 0:
        total = total * multiplicador
    else:
        total = numero * multiplicador

print(f"El numero factorial de {numero} es {total}")