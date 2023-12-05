#Aplicacion de compra
compra = float(input("Cuanto has gastado "))
total = compra
if compra > 100:
    total = compra - (compra * 15 / 100)
    print(f"Se te aplica un descuento de 15% por lo tanto es {total}")
else:
    print(f"El total ha pagar es de {total}")

#Aplicacion de kebab
tamaño = input("Que tamaño quieres grande/mediano/pequeño ")
ingredientes = float(input("Cuantos extras quieres ")) * 0.5
precio = [3, 5, 9]
if tamaño == "grande":
    total = precio[2] + ingredientes
if tamaño == "mediano":
    total = precio[1] + ingredientes
if tamaño == "pequeño":
    total = precio[0] + ingredientes
print(f"En total es {total}")

#Aplicaicon para/impar
print("Dime dos numeros ")
n1 = int(input())
n2 = int(input())
numeroTotal = n1 + n2
if (numeroTotal % 2) == 0:
    print("La suma de los dos numeros es par")
else:
    print("La suma de los dos numeros es impar")

#Aplicaicon factura
print("Que cantidad de energia ha consumido en total")
energia = float(input())
total = energia * 0.135
if energia >= 700:
    total = total + (total * 0.05)
print(f"El total a pagar es de {total}€")

#Aplicacion indice masa
peso = float(input("Dime tu peso "))
altura = float(input("Dime tu altura "))
indiceMasa = peso / altura**2
if indiceMasa <= 18.5:
    print(f"Desnutrido tu indice es de {indiceMasa}")
elif indiceMasa > 18.5 and indiceMasa < 25.5:
    print(f"Peso Optimo tu indice es de {indiceMasa}")
elif indiceMasa >= 25.5:
    print(f"Sobrepeso tu indice es de {indiceMasa}")
    print(indiceMasa)
else:
    print("Has introducido mal los datos")

#Aplicacion cadena
cadena = "TRWAGMYFPDXBNJZSQVHLCKE"
nDni = int(input("Dime tu numero de dni "))
operacion = nDni % 23

letra = cadena[operacion]

if operacion >= 0 and operacion <= 5:
    print(f"Te toca el Aula 1 te corresponde la letra {letra}")
elif operacion >= 6 and operacion <= 11:
    print(f"Te toca el Aula 2 te corresponde la letra {letra}")
elif operacion >= 12 and operacion <= 17:
    print(f"Te toca el Aula 3 te corresponde la letra {letra}")
elif operacion >= 16 and operacion <= 22:
    print(f"Te toca el Aula 4 te corresponde la letra {letra}")
else:
    print("Los datos son erroneos")
