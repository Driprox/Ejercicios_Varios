# App banco
euros = int(input("Dime cuanto euros vas a ingresar "))
interes = int(input("Cuanto interes quieres "))
años = int(input("A cuantos años "))
total = euros * (1 + interes / 100) ** años
print(f"En total en esos {años} años sera de {total} €")
